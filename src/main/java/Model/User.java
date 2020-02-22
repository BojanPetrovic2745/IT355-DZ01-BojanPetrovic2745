package Model;

import Baza.Database;

 // @author Bojan Petrovic

public class User {

    private int id;
    private String ime, prezime;

    public User() {}

    public User(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + '}';
    }

}
