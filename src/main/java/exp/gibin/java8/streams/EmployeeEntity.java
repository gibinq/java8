package exp.gibin.java8.streams;
/**
 * Entity class for employee
 * @author WIIS
 *
 */
public class EmployeeEntity {

	int id;
	String name;
	long salary;
	
	public EmployeeEntity(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String toString() {
		return ""+id+" "+name+" "+salary;
	}
	
	
}
