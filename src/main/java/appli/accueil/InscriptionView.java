package appli.accueil;

import appli.StartApplication;
import appli.model.Utilisateur;
import appli.model.repository.UtilisateurRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InscriptionView {

    @FXML
    private Button inscription;

    @FXML
    private Button retour;

    @FXML
    private TextField txtNom;

    @FXML
    private TextField txtPrenom;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtMdp;

    @FXML
    void OnActionInscription(ActionEvent event) {
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String email = txtEmail.getText();
        String mdp = txtMdp.getText();

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setEmail(email);
        utilisateur.setMdp(mdp);

        UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
        boolean success = utilisateurRepository.inscription(utilisateur);

        if (success) {
            System.out.println("Inscription réussie !");
        } else {
            System.out.println("Inscription échouée !");
        }
    }

    @FXML
    void OnActionRetour(ActionEvent event) {
        StartApplication.changeScene("accueil/loginView", "Connexion");
    }
}