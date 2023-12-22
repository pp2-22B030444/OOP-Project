package Employee;

import java.util.Comparator;

import Department.Teacher;

public class TeacherIdComparator implements Comparator<Teacher> {


	@Override
	public int compare(Teacher o1, Teacher o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}



}
