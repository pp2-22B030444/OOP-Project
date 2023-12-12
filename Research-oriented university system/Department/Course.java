package Department ;

import java.util.Vector;

import Students.Student;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Course
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public TypeOfCourse typeOfCourse;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String disciplineName;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int credit;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String disciplineСode;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int ects;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Vector<Student> enrolledStudents;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int maxStudents;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Course(){
		
	}

	public Course(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents) {
		this();
		this.typeOfCourse = typeOfCourse;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineСode = disciplineСode;
		this.ects = ects;
		this.enrolledStudents = enrolledStudents;
		this.maxStudents = maxStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean enrollStudent(Student student ) {
		// TODO implement me
		return false;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeStudent(Student student ) {
		// TODO implement me	
	}
    
	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public String getDisciplineСode() {
		return disciplineСode;
	}

	public void setDisciplineСode(String disciplineСode) {
		this.disciplineСode = disciplineСode;
	}


	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	@Override
	public String toString() {
		return "Course [typeOfCourse=" + typeOfCourse + ", disciplineName=" + disciplineName + ", credit=" + credit
				+ ", disciplineСode=" + disciplineСode + ", ects=" + ects + ", enrolledStudents=" + enrolledStudents
				+ ", maxStudents=" + maxStudents + "]";
	}
	
}

