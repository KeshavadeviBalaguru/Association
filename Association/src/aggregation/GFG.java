package aggregation;
import java.io.*;
import java.util.*;
public class GFG {
	
	public static void main(String[] args)
	{
	Student s1 = new Student("aaa", 1, "CSE");
	Student s2 = new Student("bbb", 2, "CSE");
	Student s3 = new Student("ccc", 1, "EE");
	Student s4 = new Student("ddd", 2, "EE");
	Student s5 = new Student("eee", 3, "EE");


	List<Student> cse_students = new ArrayList<Student>();


	cse_students.add(s1);
	cse_students.add(s2);

	List<Student> ee_students
	= new ArrayList<Student>();


	ee_students.add(s3);
	ee_students.add(s4);
	ee_students.add(s5);


	Department CSE = new Department("CSE", cse_students);
	Department EE = new Department("EE", ee_students);

	List<Department> departments = new ArrayList<Department>();
	departments.add(CSE);
	departments.add(EE);


	Institute institute = new Institute("BITS", departments);

	System.out.print("Total students in institute: ");

	System.out.print(institute.getTotalStudentsInInstitute());
}
}