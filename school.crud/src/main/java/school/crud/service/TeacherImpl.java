package school.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.crud.model.Teacher;
import school.crud.repo.TeacherRepo;

@Service
public class TeacherImpl implements TeacherService {
@Autowired
private TeacherRepo teacherRepo;

@Override
public List<Teacher> login(Teacher t) {
	// TODO Auto-generated method stub
	return teacherRepo.findByUsernameAndPassword(t.getUsername(), t.getPassword());
}

}
