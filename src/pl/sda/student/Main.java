package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

//        Student student = new Student("Jan", "Kowalski", 32);
//        Student student1 = new Student("Adnrzej", "Bator",60);
//        Student student2 = new Student("Błażej", "Nowakowski", 30);
//        Student student3 = new Student("Karolina", "Bocian", 16);
//        Student student4 = new Student("Rafał", "Boniek", 71);
//        Student student5 = new Student("Mariusz", "Tomczyk", 25);

        ObjectMapper objectMapper = new ObjectMapper();

        List<Student> Studentlist = new ArrayList<>();
//        Studentlist.add(student);
//        Studentlist.add(student1);
//        Studentlist.add(student2);
//        Studentlist.add(student3);
//        Studentlist.add(student4);
//        Studentlist.add(student5);

//        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
            objectMapper.writeValue(new File("ListaStudentow.json"), Studentlist);
        } catch (IOException e) {
            e.printStackTrace();
        }


        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("lista.json",Studentlist);

    }
}
