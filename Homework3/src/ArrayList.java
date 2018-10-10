// Jasmine Chin 111717723

public class ArrayList {
	private Object[] somearray;
	
	public ArrayList() {
		somearray = new Object[0];
	}
	
	public void add(Object o) {
		Object[] newarray = new Object[somearray.length+1];
		for (int i = 0; i < somearray.length; i++) {
			newarray[i] = somearray[i];
		}
		newarray[somearray.length] = o;
		somearray = newarray;
	}
	
	public void add(int index, Object o) {
		Object[] newarray = new Object[somearray.length+1];
		for (int i = 0; i < index; i++) {
			newarray[i] = somearray[i];
		}
		newarray[index] = o;
		for (int j = index+1; j < newarray.length; j++) {
			newarray[j] = somearray[j-1];
		}
		somearray = newarray;
	}
	
	public void clear() {
		somearray = new Object[0];
	}
	
	public boolean contains(Object o) {
		for (int i = 0; i < somearray.length; i++) {
			if (somearray[i].equals(o)) {
				return true;
			} 
		} return false;
	}
	
	public Object get(int index) {
		return somearray[index];
	}
	
	public int indexOf(Object o) {
		for (int i = 0; i < somearray.length; i++) {
			if (somearray[i].equals(o)) {
				return i;
			} 
		} return -1;
	}
	
	public boolean isEmpty() {
		if (somearray.length == 0) {
			return true;
		} return false;
	}
	
	public int lastIndexOf(Object o) {
		for (int i = somearray.length-1; i >= 0; i--) {
			if (somearray[i].equals(o)) {
				return i;
			}
		} return -1;
	}
	
	public boolean remove(Object o) {
		Object[] newarray = new Object[somearray.length-1];
		for (int index = 0; index < somearray.length; index++) {
			if (somearray[index].equals(o)) {
				for (int j = 0; j < index; j++) {
					newarray[j] = somearray[j];
				}
				newarray[index] = somearray[index+1];
				for (int k = index+1; k < newarray.length; k++) {
					newarray[k] = somearray[k+1];
				}
				somearray = newarray;
				return true;
			}
		} return false;
	}
	
	public int size() {
		return somearray.length;
	}
	
	public Object remove(int index) {
		Object[] newarray = new Object[somearray.length-1];
		for (int i = 0; i < index; i++) {
			newarray[i] = somearray[i];
		}
		for (int j = index; j < newarray.length; j++) {
			newarray[index] = somearray[index+1];
		}
		Object removed = somearray[index];
		somearray = newarray;
		return removed;
	}
	
	public Object set(int index, Object o) {
		Object[] newarray = new Object[somearray.length];
		for (int i = 0; i < index; i++) {
			newarray[i] = somearray[i];
		}
		newarray[index] = o;
		for (int j = index+1; j < somearray.length; j++) {
			newarray[j] = somearray[j];
		}
		Object changed = somearray[index];
		somearray = newarray;
		return changed;
	}

	public static void main(String[] args) {
		ArrayList test1 = new ArrayList();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		System.out.print("[ ");
		for (int i = 0; i < test1.size(); i++) {
			System.out.print(test1.get(i) + " ");
		}
		System.out.println("]");
		System.out.print(test1.size());
	}

}
