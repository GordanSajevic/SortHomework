
public class PhonebookApp {
	
	public static void main(String[] args) {
		Person[] phonebook = new Person[] {
	      new Person("Aja", "Goehring"),
				new Person("Arvilla", "Hodžiæ"),
				new Person("Lavette", "Viveiros"),
				new Person("Mandi", "Arguello"),
				new Person("Annett", "Mize"),
				new Person("Shantell", "Dike"),
				new Person("Daphine", "Dillman"),
				new Person("Louella", "Hodžiæ"),
				new Person("Amalia", "Brigman"),
				new Person("Alphonse", "Varley"),
				new Person("Phil", "Ewen"),
				new Person("Olimpia", "Saenz"),
				new Person("Erminia", "Mirando"),
				new Person("Edythe", "Castenada"),
				new Person("Robbi", "Maese"),
				new Person("Kelley", "Printz"),
				new Person("Dannie", "Ocasio"),
				new Person("Charles", "Hodžiæ"),
				new Person("Rubie", "Washer"),
				new Person("Bryant", "Masker"),
				new Person("Julius", "Stalzer"),
				new Person("Clement", "Prager"),
				new Person("Kathie", "Oquin"),
				new Person("Shakira", "Hernandes"),
				new Person("Armand", "Boler"),
				new Person("Foster", "Tims"),
				new Person("Hana", "Howson"),
				new Person("Arletta", "Nastasi"),
				new Person("Rebeca", "Mcnally"),
				new Person("Hsiu", "Rosemond"),
				new Person("Tyson", "Hodžiæ"),
				new Person("Celina", "Gallego"),
				new Person("Criselda", "Herrell"),
				new Person("Kendall", "Bascombe"),
				new Person("Nubia", "Deeter"),
				new Person("Joannie", "Deshields"),
				new Person("Sarai", "Criner"),
				new Person("Joette", "Anderson"),
				new Person("Alfonzo", "Rubinstein"),
				new Person("Justin", "Capshaw"),
				new Person("Elton", "Schnee"),
				new Person("Sage", "Sherrer"),
				new Person("Vita", "Neihoff"),
				new Person("Nikia", "Moody"),
				new Person("Linsey", "Profitt"),
				new Person("Tanesha", "Hodžiæ"),
				new Person("Billye", "Widman"),
				new Person("Kareem", "Whalley"),
		};
 
		Comparator firstName = new FirstNameComparator();
		System.out.println("Sortirani po imenima\n");
	//	sortByFirstName(phonebook);
		sortWithComparator(phonebook, firstName);
		printPhonebook(phonebook);
		System.out.println();
		Comparator lastName = new LastNameComparator();
		System.out.println("Sortirani po prezimenima\n");
	//	sortByLastName(phonebook);
		sortWithComparator(phonebook, lastName);
		printPhonebook(phonebook);
		
		
	}
 
	/**
	 * Funkcija koja sortira niz po imenima
	 * @param array
	 */
	
	private static void sortByFirstName(Person[] array) {
		//Insertion sort
		for (int i=0; i<array.length-1; i++)
		{
			int index = i;
			while(index > 0 &&  array[index].getFirstName().compareTo(array[index+1].getFirstName())>0)
			{
				Person temp = array[index];
				array[index] = array[index+1];
				array[index+1] = temp;
				index--;
			}
		} 
	}	
 
	/**
	 * Funkcija koja sortira niz po prezimenima
	 * @param array
	 */
	
	private static void sortByLastName(Person[] array) {
		//Insertion sort
		for (int i=0; i<array.length-1; i++)
		{
			int index = i;
			while(index > 0 &&  array[index].getLastName().compareTo(array[index+1].getLastName())>0)
			{
				Person temp = array[index];
				array[index] = array[index+1];
				array[index+1] = temp;
				index--;
			}
		} 
		
		//Selection sort
		
	/*	for (int i=0; i<array.length-1; i++)
		{
			int minIndex = i;
			for (int j = i; j<array.length; j++)
			{
				if (array[j].getLastName().compareTo(array[minIndex].getLastName())<0)
				{
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				Person temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
			
		} */
		
		//Bubble sort
		
	/*	for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length; j++)
			{
				if (array[j].getLastName().compareTo(array[i].getLastName())<0)
				{
					Person temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		} */
	}
 
	/**
	 * Funkcija koja ispisuje sva imena i prezimena u nizu
	 * @param phonebook
	 */
	
	private static void printPhonebook(Person[] phonebook) {
		for (Person person : phonebook) {
			System.out.println(person);
		}
	}
	
	/**
	 * Funkcija koja sortira niz uz pomoæ objekta comparator, koji implementira interface Comparator
	 * @param array
	 * @param comparator
	 */
	
	private static void sortWithComparator(Person[] array, Comparator comparator) {
		for (int i=0; i<array.length-1; i++)
		{
			int index = i;
			while(index > 0 && comparator.compare(array[index], array[index+1])>0)
			{
				Person temp = array[index];
				array[index] = array[index+1];
				array[index+1] = temp;
				index--;
			}
		}
		
	}

}
