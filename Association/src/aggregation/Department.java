package aggregation;
import java.io.*;
import java.util.*;

public class Department {
	   
    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        
        this.name = name;
        this.students = students;
    }
 
    public List<Student> getStudents()
    {
       
        return students;
    }

}
