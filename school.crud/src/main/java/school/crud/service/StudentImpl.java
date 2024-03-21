package school.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.crud.model.Student;
import school.crud.repo.StudentRepo;

@Service
public class StudentImpl implements StudentService {
	@Autowired
	public StudentRepo studentRepo;

	@Override
	public Student addStudent(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public List<Student> viewStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student viewStudent(int id) {

		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student s) {

		return studentRepo.save(s);
	}

	@Override
	public Student deleteStudent(int id) {

		Optional<Student> op = studentRepo.findById(id);
		studentRepo.deleteById(id);
		return op.get();
	}

	@Override
	public List<Student> login(Student s) {

		return studentRepo.findByEmailAndPass(s.getEmail(), s.getPass());
	}

}
