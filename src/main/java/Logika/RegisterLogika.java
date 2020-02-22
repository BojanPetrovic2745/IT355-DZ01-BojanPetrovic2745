package Logika;

import Baza.Database;
import Model.User;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;

// @author Bojan Petrovic

public class RegisterLogika extends Database {

    public static void unetiUbazu(String ime, String prezime) throws SQLException, NoSuchAlgorithmException {
        try {

            User user = new User();
            user.setIme(ime);
            user.setPrezime(prezime);

            if (user.getIme().isEmpty() || user.getPrezime().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Greska!");
                alert.setHeaderText("Registracija nije uspesna!");
                alert.setContentText("Pokusajte ponovo! ");
                alert.showAndWait();
            } else {

                CONNECTION = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                String query = "INSERT INTO users  (ime,prezime) VALUES(?,?)";

                PreparedStatement ps = CONNECTION.prepareStatement(query);
                ps.setString(1, user.getIme());
                ps.setString(2, user.getPrezime());
                ps.execute();

                ps.close();
                CONNECTION.close();
            }
        } catch (SQLException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Greska");
            alert.setHeaderText("Doslo je do greske!");
            alert.setContentText("Pokusajte ponovo.");
            alert.showAndWait();
        }
    }
}
