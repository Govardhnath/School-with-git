package school.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.crud.model.Student;
import school.crud.model.Teacher;
import school.crud.service.StudentService;
import school.crud.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class HomeController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;

	@PostMapping("/adds")
	public Student addStudent(@RequestBody Student s) {

		return studentService.addStudent(s);
	}

	@GetMapping("/valls")
	public List<Student> viewStudent() {
		return studentService.viewStudent();
	}

	@GetMapping("/vs/{id}")
	public Student viewStudent(@PathVariable(value = "id") int id) {
		return studentService.viewStudent(id);
	}

	@PutMapping("/ups")
	public Student updateStudent(@RequestBody Student s) {
		return studentService.updateStudent(s);
	}

	@DeleteMapping("/dels/{id}")
	public Student deleteStudent(@PathVariable(value = "id") int id) {
		return studentService.deleteStudent(id);
	}

	@GetMapping("/login")
	public String logint(@RequestBody Teacher t) {
		List<Teacher> o = teacherService.login(t);
		if (!o.isEmpty()) {
			return "LoggedIn Successfully!!";
		}
		return "LogIn Failed";
	}

	@GetMapping("/logins")
	public String logins(@RequestBody Student s) {
		List<Student> o = studentService.login(s);
		if (!o.isEmpty()) {
			return "LoggedIn Successfully!!";
		}
		return "LogIn Failed";
	}

}
