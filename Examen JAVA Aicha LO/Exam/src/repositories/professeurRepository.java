package repositories;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.classe;
import entities.professeur;

public class professeurRepository extends Database {
        private final  String SQL_SELECT_ALL="select * from professeur" ;
        private final  String SQL_INSERT="INSERT INTO etudiant (nomComplet_professeur) VALUES (?)";
        //select
       public void insertprofesseur(Object professeur){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, professeur.getNci());
                statement.setString(1, professeur.getNomComplet());
                statement.setString(1, professeur.getGrade());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<professeur> getAlleEtudiants(){
            List<professeur> professeurs=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                  professeur professeur=new professeur();
                   professeur.setNci(0);(rs.getInt("Nci_professeur"));
                   professeur.setNomComplet(rs.getString("nomComplet_etudiant"));
                   professeur.setGrade(rs.getString("grade_professeur"));
                   professeurs.add(professeur);
             }
             rs.close();
           closeConnexion();
        }
         catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
        }
        return  professeurs;
       }
     public List<classe> getAllprofesseur() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getAllprofesseur'");
     }
}

