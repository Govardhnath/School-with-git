package school.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import school.crud.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	public List<Student> findByEmailAndPass(String email, String pass);

}
