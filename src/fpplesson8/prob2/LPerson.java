package fpplesson8;


public class LPerson {

	private final int INITIAL_LENGTH = 4;
	private Person[] arrPerson; 
	private int size;
	
	
	public LPerson()
	{
		 arrPerson = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Person s)
	{
		if (size == arrPerson.length) resize();
		arrPerson[size++] = s;
	}
		
		
		public Person get(int i)
		{
			if (i < 0 || i >=size)
				return null;
			else
			return arrPerson[i];
				
		}
		
		
		public boolean find(Person s) {
			for (Person test : arrPerson)
			{
				if (test.equals(s))
					return true;
			}
			return false;
		}
		
		public void insert (Person s, int pos) {
			if (pos >= arrPerson.length || size+1 > arrPerson.length)
				resize();
			if (pos > size)
				arrPerson[pos] = s;
			Person[] temp = new Person[arrPerson.length + 1];
			System.arraycopy(arrPerson, 0, temp, 0, pos);
			temp[pos] = s;
			System.arraycopy(arrPerson, pos, temp, pos+1, arrPerson.length - pos);
			arrPerson = temp;
			++size;
		}
		
		public boolean remove(Person s) {
			if (size == 0) return false;
			int index = -1;
			for (int i=0; i<arrPerson.length; ++i)
			{
				if (arrPerson[i].equals(s))
					index = i;
					break;
			}
			
			if (index== -1) return false;
			Person[] temp = new Person[arrPerson.length];
			System.arraycopy(arrPerson, 0, temp, 0, index);
			System.arraycopy(arrPerson, index+1, temp, index, arrPerson.length - (index+1));
			arrPerson = temp;
			--size;
			return true;		
		}
		
		
		private void resize(){
			System.out.println("resizing");
			if (size == arrPerson.length)
			{
				Person[] temp = new Person[arrPerson.length * 2];
				System.arraycopy(arrPerson, 0, temp, 0, arrPerson.length);
				arrPerson = temp;
			}
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder("[");
			for (int i = 0; i<size-1; ++i)
			{
				sb.append(arrPerson[i]+", ");
			}
			sb.append(arrPerson[size-1] + "]");
			return sb.toString();
		}
	
		
		public int size() {
			return size;
		}
		
		
		public static void main(String[] args) {
			LPerson mList = new LPerson();
			mList.add(new Person("Sarf", "Philip", 90));
			mList.add(new Person("John", "Doe", 90));
			mList.add(new Person("Jow", "Spirit", 90));
			mList.add(new Person("John", "Doe", 90));
			mList.add(new Person("Jow", "Spirit", 90));
			mList.add(new Person("John", "Doe", 90));
			mList.add(new Person("Jow", "Spirit", 90));
			mList.add(new Person("Jow", "Spirit", 90));
			
			System.out.println(mList.remove(new Person("Sarf", "Philip", 90)));

			System.out.println(mList);
		}
		
}
