package services;
    
import java.util.List;
import entities.professeur;
import repositories.professeurRepository;

public class professeurService {
    private repositories.professeurRepository professeurRepository=new professeurRepository();
    public void ajouterprofesseur(professeur professeur){
        Object professeur;
        professeurRepository.insertprofesseur(professeur);
    }
    public List<professeur> listerpProfesseurs(){
          return   professeurRepository.getAllprofesseur();
    }
      
}

