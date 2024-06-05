package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.etudiant;

public class EtudiantRepository extends Database {
        private final  String SQL_SELECT_ALL="select * from etudiant" ;
        private final  String SQL_INSERT="INSERT INTO etudiant (nomComplet_etudiant) VALUES (?)";
        //select
       public void insertZone(etudiant etudiant){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, etudiant.getMatricule());
                statement.setString(1, etudiant.getNomcomplet());
                statement.setString(1, etudiant.getTuteur());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<etudiant> getAlleEtudiants(){
            List<etudiant> etudiants=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                  etudiant etudiant=new etudiant();
                   etudiant.setMatricule(0);(rs.getInt("matricule_etudiant"));
                   etudiant.setNomcomplet(rs.getString("nomComplet_etudiant"));
                   etudiant.setTuteur(rs.getString("tuteur_etudiant"));
                   etudiants.add(etudiant);
             }
             rs.close();
           closeConnexion();
        }
         catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
        }
        return  etudiants;
       }
     public void insertetudiant(etudiant etudiant) {
          throw new UnsupportedOperationException("Unimplemented method 'insertetudiant'");
     }
}

