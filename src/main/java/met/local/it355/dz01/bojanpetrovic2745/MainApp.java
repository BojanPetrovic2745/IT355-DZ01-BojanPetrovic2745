package met.local.it355.dz01.bojanpetrovic2745;

import Logika.RegisterLogika;
import Model.User;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        registerGui();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void registerGui() throws SQLException, NoSuchAlgorithmException {

        Stage st = new Stage();
        GridPane grid1 = new GridPane();

        Label labelIme = new Label("Ime: ");
        final TextField tfIme = new TextField();

        Label labelPrezime = new Label("Prezime: ");
        final TextField tfPrezime = new TextField();

        Button btnReg = new Button("Register");

        User s = new User();

        btnReg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    RegisterLogika r = new RegisterLogika();
                    r.unetiUbazu(tfIme.getText(), tfPrezime.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        grid1.setAlignment(Pos.CENTER);

        grid1.add(labelIme, 0, 0);
        grid1.add(tfIme, 1, 0);

        grid1.add(labelPrezime, 0, 1);
        grid1.add(tfPrezime, 1, 1);

        grid1.add(btnReg, 1, 6);

        Scene scene1 = new Scene(grid1, 500, 500);

        st.setTitle("Registracija");
        st.setScene(scene1);
        st.show();

    }
}
