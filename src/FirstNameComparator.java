
public class FirstNameComparator implements Comparator {
/**
 * Klasa koja poredi dva objekta po imenima i vraæa int vrijednost
 */
	
	@Override
	public int compare(Person left, Person right) {
		if (left.getFirstName().compareTo(right.getFirstName()) < 0)
		{
			return -1;
		}
		else if (left.getFirstName().compareTo(right.getFirstName()) > 0)
		{
			return 1;
		}
		return 0;
	}

}
