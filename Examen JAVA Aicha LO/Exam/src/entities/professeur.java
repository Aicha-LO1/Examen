package entities;

public class professeur {
    private int Nci;
    private String nomComplet;
    private String grade;
    public int getNci() {
        return Nci;
    }
    public void setNci(int nci) {
        Nci = nci;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
