package exp.gibin.java8.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
/*
 *https://stackify.com/streams-guide-java-8/ 
 * @author WIIS
 *
 */

public class TestStrems {

	public static void main(String[] args) {
		System.out.println("Testing stream apis");
		
		ArrayList<EmployeeEntity> empList = new ArrayList<>();
		
		//prepareing data for stream
		for(int i=0; i<10; i++)
		{
			empList.add( new EmployeeEntity(i, "Emp "+i, 1000) );
		}
		
		//get stream
		empList.stream();
		Stream.of(empList);
		
		//forEach
		empList.stream().forEach(e ->e.setSalary(2000));
		//System.out.println("Salary "+empList);
		
		//map
		
		//filter
		Long res =  empList.stream().filter(e -> e.getName().contains("Emp ")).count();
		System.out.println(" Result "+res);
		
		//collect
		
		//findfirst
		//.orElse(null)
		Optional<EmployeeEntity> optional = empList.stream().filter(e -> e.getName().contains("Emp 5")).findFirst();
		EmployeeEntity employeeEntity = optional.get();
		System.out.println("ID "+employeeEntity.getId());
		
		//toArray
		
		//flatMap
		
		//peek
		empList.stream().peek(e -> e.setName("Emp 5")).peek(System.out::println);
		System.out.println("Salary "+empList);
	}

}
