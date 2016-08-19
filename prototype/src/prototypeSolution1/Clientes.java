package prototypeSolution1;

import java.util.ArrayList;
import java.util.List;

public class Clientes implements Cloneable{

	private List<String> empList;
	
	public Clientes(){
		empList = new ArrayList<String>();
	}
	
	public Clientes(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Clientes(temp);
	}
	
}