package org.example.glider5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.sql.*;



public class HelloController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button forgotPasswordButton;
    @FXML
    private Button signUpButton;

/*

    private Connection connection;

    public void initialize() {
        connectToDatabase();
        loginButton.setOnAction(e -> executeLogin());  //Binds the executeButton to the executeQuery method
    }

    //private void connectToDatabase() {
       // String url = "jdbc:mysql://gliderserver.mysql.database.azure.com:3306/gliderdatabase?useSSL=true&serverTimezone=UTC";
        //String username = "glider"; // Replace with actual username
       // String password = "Gpassword123"; // Replace with actual password

        try {
            connection = DriverManager.getConnection(url, username, password);
            loginButton.setText("User is logged in.");
        } catch (SQLException e) {
            loginButton.setText("Error occurred while logging user to the system. Please try again. : " + e.getMessage());
        }
    }

    @FXML
    protected void loginButtonClick() throws SQLException {
        String usernameInput = usernameField.getText();
        String passwordInput = passwordField.getText();

        loginButton.setText(("Executing log in: " + usernameInput + passwordInput));
        //welcomeText.setText("Welcome to JavaFX Application!");

        String loginQuery = "SELECT * FROM user where username = ? and password = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(loginQuery));
            prepare

        }
    }

}*/