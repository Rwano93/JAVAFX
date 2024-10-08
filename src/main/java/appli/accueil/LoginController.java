package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button connexion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtMdp;

    @FXML
    private void OnActionConnexion() {
        String email = txtEmail.getText();
        String mdp = txtMdp.getText();

        System.out.println("Connexion");
    }

    @FXML
    private void OnActionMdpOublie() {
        System.out.println("Mot de passe oublié");
    }

    @FXML
    private void OnActionInscription() {
        StartApplication.changeScene("accueil/inscriptionView", "Inscription");
    }
}