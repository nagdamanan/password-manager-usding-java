package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import launcher.PasswordManagerLauncher;
import model.PasswordManagerModel;

public class RegisterController extends SmallWindowController {

    @FXML
    private PasswordField passwordField2;
    @FXML
    private Button cancelButton;
    private LoginController loginController;

    public void initialize(LoginController loginController) {
        this.loginController = loginController;
    }


    @Override
    public void mainButtonOnAction() {
        String username = usernameTextField.getText();
        String password1 = passwordField1.getText();
        String password2 = passwordField2.getText();

        if (loginController.model.hasUser(username)) {
            invalidLabel.setText("User exists");
            invalidLabel.setVisible(true);
        } else if (!password1.equals(password2)) {
            invalidLabel.setText("Passwords do not match");
            invalidLabel.setVisible(true);
        } else if (password1.length() < PasswordManagerModel.MIN_PASSWORD_LENGTH) {
            invalidLabel.setText("Min password length: " + PasswordManagerModel.MIN_PASSWORD_LENGTH);
            invalidLabel.setVisible(true);
        } else {
            loginController.model.addUser(username, password1);
            loginController.borderPane.setDisable(false);
            loginController.regStage.close();
            mainButton.getScene().getWindow().hide();
            PasswordManagerLauncher pml = new PasswordManagerLauncher();
            try {
				pml.start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }	
    public void cancelButtonOnAction() throws Exception {
        cancelButton.getScene().getWindow().hide();
        PasswordManagerLauncher pml = new PasswordManagerLauncher();
        pml.start(new Stage());
    }
}
