import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(54);
		t.add(23);
		t.add(43);
		t.add(21);
		t.add(35);
		t.add(27);
		t.add(33);
		System.out.println("TreeSet is :"+t);
		System.out.println("TreeSet contains 33 : "+t.contains(33));
	}

}
