package school.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import school.crud.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
public List<Teacher> findByUsernameAndPassword(String username, String Password);
}
