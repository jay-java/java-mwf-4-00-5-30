package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"name");//entry
		map.put(10, "name");
		map.put(2,"name2");
		map.put(23.3, 23);
		map.put(null, "value");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey()+" value = "+entry.getValue());
		}
	}
}
