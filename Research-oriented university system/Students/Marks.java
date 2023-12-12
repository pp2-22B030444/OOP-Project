package Students ;

import Department.Course;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Marks
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Grade grade;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Course course;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double firstAtt;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double   secountAtt;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double finalGrade;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Marks(){
		
	}

	public Marks(Grade grade, Course course, double firstAtt, double secountAtt, double finalGrade) {
		this();
		this.grade = grade;
		this.course = course;
		this.firstAtt = firstAtt;
		this.secountAtt = secountAtt;
		this.finalGrade = finalGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String ShowMark(Course course) {
		// TODO implement me
		return course.getDisciplineСode() + course.getDisciplineName() + this.firstAtt + this.secountAtt + this.finalGrade ;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Student getStudent() {
		// TODO implement me
		return null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public double getResult() {
		// TODO implement me
		return  this.firstAtt+this.secountAtt+this.finalGrade;	
	}
	public String getGrade() {
		if(95<=getResult()&& getResult()<=100 ) {
			return "A";
		}
		else if(90<=getResult() && getResult()<=94) {
			return "A-";
		}
		else if(85<=getResult() && getResult()<=89) {
			return "B+";
		}
		else if(80<=getResult() && getResult()<=84) {
			return "B";
		}
		else if(75<=getResult() && getResult()<=79) {
			return "B-";
		}
		else if(70<=getResult() && getResult()<=74) {
			return "C+";
		}
		else if(65<=getResult() && getResult()<=69) {
			return "C";
		}
		else if(60<=getResult() && getResult()<=64) {
			return "C-";
		}
		else if(55<=getResult() && getResult()<=59) {
			return "D+";
		}
		else if(50<=getResult() && getResult()<=54) {
			return "D";
		}
		else( getResult()<50) {
			return "C-";
		}
	}
	public Double getGpa() {
		if(95<=getResult()&& getResult()<=100 ) {
			return 4.0;
		}
		else if(90<=getResult() && getResult()<=94) {
			return 3.67;
		}
		else if(85<=getResult() && getResult()<=89) {
			return 3.33;
		}
		else if(80<=getResult() && getResult()<=84) {
			return 3.0;
		}
		else if(75<=getResult() && getResult()<=79) {
			return 2.67;
		}
		else if(70<=getResult() && getResult()<=74) {
			return 2.33;
		}
		else if(65<=getResult() && getResult()<=69) {
			return 2.0;
		}
		else if(60<=getResult() && getResult()<=64) {
			return 1.67;
		}
		else if(55<=getResult() && getResult()<=59) {
			return 1.33;
		}
		else if(50<=getResult() && getResult()<=54) {
			return 1.0;
		}
		else( getResult()<50) {
			return 0.0;
		}
	}
	@Override
	public String toString() {
		return "Marks [grade=" + grade + ", course=" + course + ", firstAtt=" + firstAtt + ", secountAtt=" + secountAtt
				+ ", finalGrade=" + finalGrade + "]";
	}
	
}

