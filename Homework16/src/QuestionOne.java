import java.util.TreeMap;

public class QuestionOne {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap1 =new TreeMap<Integer,String>();
		
		// ceilingEntry(key);
		
		treeMap1.put(1, "Kitap");
		treeMap1.put(4, "Defter");
		treeMap1.put(2, "Kalem");
		treeMap1.put(3, "Cetvel");
		treeMap1.put(5, "Silgi");
		
		//System.out.println(treeMap1);
		
		System.out.println(treeMap1.ceilingEntry(1)); // 1=Kitap
		
		
		// descendingKeySet();
		
		System.out.println(treeMap1.descendingKeySet()); // [5, 4, 3, 2, 1]
		
		//  firstEntry(); 
		
		System.out.println(treeMap1.firstEntry()); // 1=Kitap
		
		//  floorEntry(key);
		
		System.out.println(treeMap1.floorEntry(5)); // 5=Silgi
		
		// headMap(key);
		
		System.out.println(treeMap1.headMap(3)); //{1=Kitap, 2=Kalem}
		
		// headMap(key,true); 
		
		System.out.println(treeMap1.headMap(3,true)); //{1=Kitap, 2=Kalem, 3=Cetvel}
		
		//tailMap(key);
		
		System.out.println(treeMap1.tailMap(3));// {3=Cetvel, 4=Defter, 5=Silgi}
		
		// tailMap(key,false); 
		
		System.out.println(treeMap1.tailMap(3,false));// {4=Defter, 5=Silgi}
		
		
		
	
		
	}

}
