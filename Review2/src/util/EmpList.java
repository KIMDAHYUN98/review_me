package util;

import java.util.ArrayList;

public class EmpList {
	ArrayList<Emp> list;
	
	public EmpList() {
		list = new ArrayList<>();
	}
	
	// 추가
	
	public void addEmp(Emp emp) {
		list.add(emp);
	}
	
	// 해당 사원 이름 조회
	
	public String getName(int idx) {
		String name = "";
		name = list.get(idx).name;
		return name;
	}
	
	// 해당 사원 삭제
	public void delEmp(int idx) {
		list.remove(idx);
	}
	
	// 전체 이름 조회
	public void getNames() {
		for(Emp e : list) {
			System.out.println(e.name);
		}
	}
	
	public String getNameStr() {
		String names = "";
		for(Emp e : list) {
			names += e.name;
		}
		return names;
	}
	
	public ArrayList<Emp> getList() {
		return list;
	}
}
