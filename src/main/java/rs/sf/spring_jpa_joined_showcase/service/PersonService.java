package rs.sf.spring_jpa_joined_showcase.service;

import java.util.List;

import rs.sf.spring_jpa_joined_showcase.domain.Person;
import rs.sf.spring_jpa_joined_showcase.domain.Professor;
import rs.sf.spring_jpa_joined_showcase.domain.Student;

public interface PersonService {
	public List<Person> findAll();
	public List<Professor> findAllProfessors();
	public List<Student> findAllStudents();
	public Person findById(Long id);
	public Person findByLastName(String lastName);
}
