
public class LastNameComparator implements Comparator{

	/**
	 * Klasa koja poredi dva objekta po prezimenima i vraæa int vrijednost
	 */
	
	@Override
	public int compare(Person left, Person right) {
		if (left.getLastName().compareTo(right.getLastName()) < 0)
		{
			return -1;
		}
		else if (left.getLastName().compareTo(right.getLastName()) > 0)
		{
			return 1;
		}
		return 0;
	}
	
}
