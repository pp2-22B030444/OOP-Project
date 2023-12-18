package Department;

public class Lesson {
	public TypeOfLesson type;
	public Teacher teacher;
	public Course course;
	public Lesson(TypeOfLesson type, Teacher teacher, Course course) {
		this.type = type;
		this.teacher = teacher;
		this.course = course;
	}
	public TypeOfLesson getType() {
		return type;
	}
	public void setType(TypeOfLesson type) {
		this.type = type;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course;
	}
	public void setCource(Course course) {
		this.course = course;
	}
	
	
}
