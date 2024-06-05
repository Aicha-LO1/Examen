package services;
import java.util.List;
import entities.etudiant;
import repositories.EtudiantRepository;

public class etudiantService {
    private EtudiantRepository EtudiantRepository=new EtudiantRepository();
    public void ajouteretu(etudiant etudiant){
        EtudiantRepository.insertetudiant((entities.etudiant) etudiant);
    }
    public List<etudiant> listereEtudiants(){
          return   EtudiantRepository.getAlleEtudiants();
    }
      
}

