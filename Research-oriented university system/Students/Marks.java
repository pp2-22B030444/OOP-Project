package Students ;

import Department.Course;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Marks{

	public Course course;
	private double firstAtt;
	private double secountAtt;
	private double finalGrade;
	public Marks(){
		
	}
	public Marks( Course course, double firstAtt, double secountAtt, double finalGrade) {
		this();
		this.course = course;
		this.firstAtt = firstAtt;
		this.secountAtt = secountAtt;
		this.finalGrade = finalGrade;
	}
	public String showMark() {
		// TODO implement me
		return "Disipline code: "+ course.getDisciplineCode() + " Disipline name: "+ course.getDisciplineName() + " Fist attestation: "+this.firstAtt+"/30" + " Second attestation: "+this.secountAtt+"/30" +" Final exam: "+ this.finalGrade+"/40" ;	
	}
	
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
		else {
			return "F";
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
		else {
			return 0.0;
		}
	}
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getFirstAtt() {
		return firstAtt;
	}

	public void setFirstAtt(double firstAtt) {
		this.firstAtt = firstAtt;
	}

	public double getSecountAtt() {
		return secountAtt;
	}

	public void setSecountAtt(double secountAtt) {
		this.secountAtt = secountAtt;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}
	@Override
	public String toString() {
		return "Marks ["+ "Course=" + course + ", firstAtt=" + firstAtt + ", secountAtt=" + secountAtt
				+ ", finalGrade=" + finalGrade + "]";
	}
	
}

