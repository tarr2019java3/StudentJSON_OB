package pl.sda.student;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.source.util.SourcePositions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {

    public void writeList(String filename, List<Student> student) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filename), student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readList(String filename) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Student[] students;
            students = objectMapper.readValues( new File(filename), Student[].class);
            for (Student stu : students) {
                System.out.println(stu.getName());

            }}catch(IOException e)
            {
                e.printStackTrace();

            }

        }

    }
}
