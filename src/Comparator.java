
public interface Comparator {

	/**
	 * Compares two objects of type Person.
	 * 
	 * @param left
	 *            A person to compare
	 * @param right
	 *            A person to which left is compared
	 * @return -1 if left is less than right, 0 if they are equal and 1 if left
	 *         is greater than right
	 */
	int compare(Person left, Person right);
}
