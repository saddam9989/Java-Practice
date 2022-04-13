import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {
	public static void main(String[] args) {
		
		 ArrayList<Employee> array = new ArrayList<>();
		 
		
		array.add(new Employee(1, "Srikanth", 2, 19800, 5, "testing department"));
		array.add( new Employee(2, "Saddam", 2.5, 11800, 5, "testing department"));
		array.add( new Employee(3, "Ravi", 3.5, 29800, 3, "developer department"));
		array.add( new Employee(4, "Mahesh", 1.5, 15800, 3, "developer department"));
		array.add( new Employee(5, "Rahul", 4, 30800, 1, "Manager department"));
		  
	System.out.println("Sorting with EmpNo");	
		//Sorting with empNo
		Collections.sort(array);
		 Iterator it = array.iterator();
		 while (it.hasNext())
	            System.out.println(it.next());
		 

		 System.out.println("========================================================================================================");	
		 System.out.println("Sorting with EmpNames");
		 
		 // sorting with employee name
			Collections.sort(array, new NameComparator());
			 Iterator itr = array.iterator();
			 while (itr.hasNext())
		            System.out.println(itr.next());
			 
			 
System.out.println("========================================================================================================"); 
			 System.out.println("Sorting with salary");
			 
			 // sorting with employee salary
				Collections.sort(array, new SalaryComparator());
				 Iterator itr1 = array.iterator();
				 while (itr1.hasNext())
			            System.out.println(itr1.next());
				 
				 
	}

}
