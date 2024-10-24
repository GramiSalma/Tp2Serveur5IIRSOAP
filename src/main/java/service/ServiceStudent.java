package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Student;

import model.Genre;

import java.util.List;

@WebService(serviceName = "serviceEtudiant")
public class ServiceStudent {
    @WebMethod(operationName = "listEtudiants")
    public List<Student>listStudents(){
        return List.of(
                new Student(1,"ET_Nom1","ET_Prénom1", Genre.HOMME),
                new Student(2 ,"ET_Nom2","ET_Prénom2", Genre.FEMME),
                new Student(3 ,"ET_Nom3","ET_Prénom3", Genre.HOMME)
        );
    }
}
