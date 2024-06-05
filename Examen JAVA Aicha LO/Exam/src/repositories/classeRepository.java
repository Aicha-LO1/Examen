
package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.classe;
import entities.etudiant;


public class classeRepository  extends Database{
    private final  String SQL_SELECT_ALL="select * from classe c, etudiant e, professeur p where c.etudiant_matricule=e.matricule_etudiant" ;
    private final  String SQL_INSERT="INSERT INTO `classe` (`libellé`) VALUES (?,?,?,?)";
    public void insertBien(classe classe){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, classe.getLibellé());
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<classe> getAllcClasses(){
            List<classe> classes=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                     etudiant etudiant=new etudiant();
                     etudiant.setMatricule(rs.getInt("matricule_etudiant"));
                     etudiant.setNomcomplet(rs.getString("nomComplet_etudiant"));
                     etudiant.setTuteur(rs.getString("tuteur_etudiant"));

                     
                     classe classe=new classe();
                     classe.setLibellé(rs.getString("libellé"));
             }
             rs.close();
            closeConnexion();
          }
          catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
         }
         return  classes;
       }
      public void insertclasse(classe classe) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertclasse'");
      }
    public static List<classe> getAllprofesseur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllprofesseur'");
    }
}


