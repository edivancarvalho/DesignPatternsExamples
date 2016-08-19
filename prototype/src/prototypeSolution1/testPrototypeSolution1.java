package prototypeSolution1;

import java.util.List;

public class testPrototypeSolution1 {
	//http://www.journaldev.com/1440/prototype-design-pattern-in-java

	public static void main(String[] args) throws CloneNotSupportedException {
		Clientes emps = new Clientes();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Clientes empsNew = (Clientes) emps.clone();
		
		Clientes empsNew1 = (Clientes) emps.clone();
		
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

	
}
