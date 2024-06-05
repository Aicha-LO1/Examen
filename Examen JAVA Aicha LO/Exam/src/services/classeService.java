package services;

import java.util.List;
import entities.classe;
import repositories.classeRepository;

public class classeService {
    private classeRepository classeRepository=new classeRepository();
    public void ajouterclasse(classe classe){
        classeRepository.insertclasse(classe);
    }
    public List<classe> listercClasses(){
          return   classeRepository.getAllcClasses();
    }
      
}

