import java.util.List;
import java.util.Scanner;
import entities.classe;
import entities.etudiant;
import entities.professeur;
import services.classeService;
import services.etudiantService;
import services.professeurService;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        classeService classeService=new classeService();
        etudiantService etudiantService=new etudiantService();
        professeurService professeurService=new professeurService();

       
        do {
            System.out.println("1-Creer une claase"); 
            System.out.println("2-Lister les classes");
            System.out.println("3-Filter par  professeur");
            System.out.println("4-Ajouter un professeur"); 
            System.out.println("5-Lister les  professeur");
            System.out.println("6-Affecter un professeur à une classe");
            System.out.println("7-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {

                case 1:
                     System.out.println("Entrer la classe");
                     String libelléString=sc.nextLine(); 
                     etudiantService= (services.etudiantService) etudiantService.listereEtudiants(); 
                        for (etudiant e : etudiant) {
                            System.out.println(e.getMatricule()+"-"+e.getNomcomplet()+"-"+e.getTuteur());   
                        }
                       etudiant=new etudiant();
                       int matricule_etudiant;
                       classe classe=new classe();
                       classe.setLibellé(choix);(libelléString);
                       
                       classeService.ajouterclasse(classe);
                   break;

                case 2:
                   List<classe> classes= classeService.listercClasses();
                   for (classe c : classes) {
                       System.out.println("libellé : "+c.getLibellé() ); 
                   }
                 
                   break; 
                    
              case 3:
              break; 

              case 4:
              Ajouter<professeur> professeur= professeurService.ajouterprofesseur();
              for (professeur p : professeur) {
                  System.out.println("Nci : "+p.getNci() ); 
                  System.out.println("NomCoplet : "+p.getNomComplet() ); 
                  System.out.println("Garde : "+p.getGrade() );
              }
            


                   case 5:
                   List<professeur> biens= professeurService.listerpProfesseurs();
                   for (professeur p : professeur) {
                       System.out.println("Nci : "+p.getNci() ); 
                       System.out.println("NomCoplet : "+p.getNomComplet() ); 
                       System.out.println("Garde : "+p.getGrade() ); 
                       System.out.println("------------------------------------");      
                   }
                 
                   break; 
                   case 6:
                  
                   break; 

            }
          } while (choix!=5);
    }
}