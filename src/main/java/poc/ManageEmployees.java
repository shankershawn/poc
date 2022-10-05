package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> employees = new ArrayList<>();
		//somelogic to populate the list
		employees.add(new Employee1(1L, "John1", 30, 400));
		employees.add(new Employee1(2L, "John2", 35, 324));
		employees.add(new Employee1(3L, "John3", 40, 87));
		employees.add(new Employee1(4L, "John4", 45, 1243));
		employees.add(new Employee1(5L, "John5", 50, 2354));
		//List<String> managedEmployees =
		//System.out.println(
		String result = employees
				.stream()
				.filter(a -> a.getAge() > 40).sorted((e1, e2) -> {
			if(e1.getSalary() > e2.getSalary()) {
				return -1;
			}else if(e1.getSalary() < e2.getSalary()) {
				return 1;
			}else {
				return 0;
			}
		}).map(e -> e.getName())
		//.collect(Collectors.toList());
		.collect(Collectors.joining(","));
		System.out.println(result);
		
	}

}
