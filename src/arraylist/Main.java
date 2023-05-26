package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("たなか");
		list.add("さとう");
		list.add("たにかわ");
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		System.out.println( "----------------------" );
		//HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("name","山田太郎");
		map.put("tel","090-1111-2222");
		System.out.println(map.get("name"));
		System.out.println(map.get("tel"));
		
	}

	
	
}
