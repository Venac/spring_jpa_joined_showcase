package rs.sf.spring_jpa_joined_showcase.domain;

import javax.persistence.Entity;

@Entity
public class Student extends Person {

	private String studentCardId;

	public Student() {
		super();
	}

	public Student(final Long id, final String firstName, final String lastName, final String studentCardId) {
		super(id, firstName, lastName);
		this.studentCardId = studentCardId;
	}

	public String getStudentCardId() {
		return studentCardId;
	}

	public void setStudentCardId(final String studentCardId) {
		this.studentCardId = studentCardId;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Student [studentCardId=");
		builder.append(studentCardId);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
