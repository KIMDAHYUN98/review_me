package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapUtil {
	
	HashMap<Integer, Emp> map;
	
	public MapUtil() {
		map = new HashMap<>();
	}
	
	// 추가
	
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	
	// 수정
	
	public void updEmp(Integer id, Emp emp) {
		map.replace(emp.id, emp);
	}
	
	// 삭제
	
	public void delEmp(Integer id) {
		map.remove(id);
	}
	
	// 해당 사번의 이름 조회
	
	public String getName(Integer id) {
		String name = "";
		name = map.get(id).name;
		return name;
	}
	
	// map 리턴
	
	public HashMap<Integer, Emp> getMap() {
		return map;
	}
	
	// 전체 조회 map.keySet() ==> Iterator ==> for
	
	public void selectEmp() {
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			Emp value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
	}
}
