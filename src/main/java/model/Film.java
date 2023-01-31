package model;

public class Film {
    private long id;
    private String titre;
    private int duree;
    private String realisateur;

    public Film() {
    }

    public Film(long id, String titre, int duree, String realisateur) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public Film(String titre, int duree, String realisateur) {
        this.titre = titre;
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", duree=" + duree +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }
}
