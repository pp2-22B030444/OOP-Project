package Students ;

import java.util.Vector;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StudentOrganization {
    public static Vector<Student> listStudent;
    public String head;
    public NameOrganization nameOrganization;

    public StudentOrganization(Vector<Student> listStudent, String head, NameOrganization nameOrganization) {
        StudentOrganization.listStudent =listStudent ;     
        this.head = head;
        this.nameOrganization = nameOrganization;
    }
	public static void addMember(Student student) {
		listStudent.add(student);
        
    }
	public void removeMember(Student student) {
		// TODO implement me	
			listStudent.remove(student);
			System.out.println(student.getName()+"exit!");
    }
	public static Vector<Student> getListStudent() {
		return listStudent;
	}
	public static void setListStudent(Vector<Student> listStudent) {
		StudentOrganization.listStudent = listStudent;
	}
}

