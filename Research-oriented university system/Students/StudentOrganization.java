package Students ;

import java.util.Vector;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StudentOrganization{
	public static Vector<Student> listStudent;
	public static Vector<Student> listStudentBCL;
	public static Vector<Student> listStudentOSIT;
	public static Vector<Student> listStudentK2L;
	public Student head;
	public static NameOrganization nameOrganization;
	public StudentOrganization(){
		
	}	
	public StudentOrganization(Vector<Student> listStudentBCL, Vector<Student> listStudentOSIT,Vector<Student> listStudentK2L, Student head,
			NameOrganization nameOrganization) {
		this();
		StudentOrganization.listStudentBCL = listStudentBCL;
		StudentOrganization.listStudentOSIT=listStudentOSIT;
		StudentOrganization.listStudentK2L=listStudentK2L;
		this.head = head;
		StudentOrganization.nameOrganization = nameOrganization;
	}
	
	public static void addMember(Student student, NameOrganization nameOrganization) {
		listStudent.add(student);
        
    }
//	public void removeMember(Student student) {
//		// TODO implement me	
//		if(o.equals(NameOrganization.BCL)) {
//			listStudentBCL.remove(student);	
//		}
//		if(o.equals(NameOrganization.OSIT)) {
//			listStudentOSIT.remove(student);	
//		}
//		if(o.equals(NameOrganization.K2L)) {
//			listStudentK2L.remove(student);	
//		}
//		else {
//	        System.out.println("Unknown organization: " + nameOrganization);
//	    }
//	}	
}

