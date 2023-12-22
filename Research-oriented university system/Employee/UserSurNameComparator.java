package Employee;

import java.util.Comparator;

public class UserSurNameComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getSurname().compareTo(o2.getSurname());
	}

}
