package school.crud.service;

import java.util.List;

import school.crud.model.Student;

public interface StudentService {

	Student addStudent(Student s);

	public List<Student> viewStudent();

	Student viewStudent(int id);

	Student updateStudent(Student s);

	Student deleteStudent(int id);

	public List<Student> login(Student s);


	
}
