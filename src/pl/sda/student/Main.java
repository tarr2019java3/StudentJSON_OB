package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Adnrzej", "Bator",60);
        Student student2 = new Student("Błażej", "Nowakowski", 30);
        Student student3 = new Student("Karolina", "Bocian", 16);
        Student student4 = new Student("Rafał", "Boniek", 71);
        Student student5 = new Student("Mariusz", "Tomczyk", 25);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
