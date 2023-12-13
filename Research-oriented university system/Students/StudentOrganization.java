package Students ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StudentOrganization{
	
	public Vector<Student> listStudentBCL;
	public Vector<Student> listStudentOSIT;
	public Vector<Student> listStudentK2L;
	public Student head;
	public NameOrganization nameOrganization;
	public StudentOrganization(){
		
	}	
	public StudentOrganization(Vector<Student> listStudentBCL, Vector<Student> listStudentOSIT,Vector<Student> listStudentK2L, Student head,
			NameOrganization nameOrganization) {
		this();
		this.listStudentBCL = listStudentBCL;
		this.listStudentOSIT=listStudentOSIT;
		this.listStudentK2L=listStudentK2L;
		this.head = head;
		this.nameOrganization = nameOrganization;
	}
	
	public void addMember(Student student, NameOrganization o) {
		if(o.equals(NameOrganization.BCL)) {
			listStudentBCL.add(student);	
		}
		if(o.equals(NameOrganization.OSIT)) {
			listStudentOSIT.add(student);	
		}
		if(o.equals(NameOrganization.K2L)) {
			listStudentK2L.add(student);	
		}
		else {
	        System.out.println("Unknown organization: " + nameOrganization);
	    }
	}	
	public void removeMember(Student student,NameOrganization o) {
		// TODO implement me	
		if(o.equals(NameOrganization.BCL)) {
			listStudentBCL.remove(student);	
		}
		if(o.equals(NameOrganization.OSIT)) {
			listStudentOSIT.remove(student);	
		}
		if(o.equals(NameOrganization.K2L)) {
			listStudentK2L.remove(student);	
		}
		else {
	        System.out.println("Unknown organization: " + nameOrganization);
	    }
	}	
}

