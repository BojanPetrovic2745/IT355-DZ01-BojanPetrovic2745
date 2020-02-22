package Baza;

import java.sql.Connection;

/**
 *
 * @author Bojan Petrovic
 */
public class Database {

    protected static Connection CONNECTION = null;

    protected static final String URL = "jdbc:mysql://localhost/it355-dz01";
    protected static final String USERNAME = "root";
    protected static final String PASSWORD = "";

    public static Connection getCONNECTION() {
        return CONNECTION;
    }

    public static void setCONNECTION(Connection aCONNECTION) {
        CONNECTION = aCONNECTION;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public Database() {
    }

    @Override
    public String toString() {
        return "Database{" + '}';
    }

}
