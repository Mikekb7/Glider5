package org.example.glider5;

public class Queries {
    public static final String login = "SELECT Username, Password FROM user WHERE Username = ? AND Password = ?";
    public static final String insertQuery = "INSERT INTO user (username, password, first_name, last_name, Role, email, address, city, state, zipcode, securityquestion, securityanswer, ssn)VALUES (?, ?, ?, ?, 'user', ?, ?, ?, ?, ?, 'What's your pet name?', ?, ?)";
}