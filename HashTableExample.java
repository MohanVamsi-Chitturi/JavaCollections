import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(3, "Mohan");
		ht.put(1, "Vamsi");
		ht.put(2, "Shanmukh");
		ht.put(5, "Asish");
		ht.put(6, "Anuroop");
		System.out.println("Hash Table : "+ht);
		System.out.println("HashTable contains vamsi : "+ht.containsKey("vamsi"));
	}

}
