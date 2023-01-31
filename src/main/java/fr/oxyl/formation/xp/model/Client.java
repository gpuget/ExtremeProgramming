package fr.oxyl.formation.xp.model;

public class Client {
    private long id;
    private String nom;
    private boolean isAdmin;

    public Client() {
    }

    public Client(long id, String nom, boolean isAdmin) {
        this.id = id;
        this.nom = nom;
        this.isAdmin = isAdmin;
    }

    public Client(String nom, boolean isAdmin) {
        this.nom = nom;
        this.isAdmin = isAdmin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
