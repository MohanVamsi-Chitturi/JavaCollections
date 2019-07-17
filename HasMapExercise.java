import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasMapExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap <Integer,String> hmap = new HashMap<Integer,String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int size = in.nextInt();
        System.out.println("Enter the key and values");
        for(int i=1;i<=size;i++){

            Integer a=in.nextInt();
            String b=in.next();

            hmap.put(a,b);
         //System.out.println(hmap.get(b)+" "+hmap.get(a)); 
        }
        
        for(Map.Entry m:hmap.entrySet()) {    
            System.out.println(m.getKey()+" "+m.getValue()); 
        }
        
        System.out.println("Enter the key to check");
        int key = in.nextInt();
        if(hmap.containsKey(key))
        	System.out.println(hmap.get(key)); 
        else
        	System.out.println("-1");
	}

}
