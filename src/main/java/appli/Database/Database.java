package appli.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String serveur = "localhost";
    private String nomDeLaBase = "todolistfx";
    private String utilisateur = "root";
    private String motDePasse = "";

    private String getUrl() {
        return "jdbc:mysql://" + serveur + "/" + nomDeLaBase + "?serverTimezone=UTC";
    }

    public Connection getConnexion() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(getUrl(), utilisateur, motDePasse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}