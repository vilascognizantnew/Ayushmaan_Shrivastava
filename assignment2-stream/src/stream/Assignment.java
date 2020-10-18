package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Asssignment {

	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);
		String result = "";

		//Get student with exact match name "jayesh"
		
		System.out.println("Get student with exact match name \"jayesh\"");
		for( Student s : students){
			if(s.getName().equals("Jayesh")){
				result = s.getName();
				System.out.println(s.getName());
			}
		}
		if(result==""){
			System.out.println("NA");
		}
		System.out.println("--------------------");

		//Get student with matching address "1235"
		 
		System.out.println("Get student with matching address \"1235\"");
		for( Student s : students){
			if(s.getAddress().getZipcode().equals("1235")){
				result = s.getName();
				System.out.println(s.getName());
			}
		}
		if(result==""){
			System.out.println("NA");
		}
		System.out.println("--------------------");

		//Get all student having mobile numbers 3333.
		 
		System.out.println("Get all student having mobile numbers 3333.");
		List<Student> matchMobile = students.stream().filter(student -> student.getMobileNumbers().stream()
				.anyMatch(x -> Objects.equals(x.getNumber(), "3333"))).collect(Collectors.toList());

		result = matchMobile.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
		System.out.println("--------------------");

		//Get all student having mobile number 1233 and 1234
		 
		System.out.println("Get all student having mobile number 1233 and 1234");
		List<Student> matchMultMobile = students.stream()
				.filter(student -> student.getMobileNumbers().stream()
						.allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());

		result = matchMultMobile.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
		System.out.println("--------------------");

		//Create a List<Student> from the List<TempStudent>
		 
		System.out.println("Create a List<Student> from the List<TempStudent>");
		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

		List<Student> studentList = tmpStudents.stream()
				.map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
				.collect(Collectors.toList());

		System.out.println(studentList);
		System.out.println("--------------------");

		//Convert List<Student> to List<String> of student name
		
		System.out.println("Convert List<Student> to List<String> of student name");
		List<String> studentsName = students.stream().map(Student::getName).collect(Collectors.toList());

		System.out.println(studentsName.stream().collect(Collectors.joining(",")));
		System.out.println(studentsName.stream().collect(Collectors.joining(",", "[", "]")));
		System.out.println("--------------------");

		//Convert List<students> to String
		
		System.out.println("Convert List<students> to String");
		String name = students.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);
		System.out.println("--------------------");

		//Change the case of List<String>
		System.out.println("Change the case of List<String>");

		studentsName.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("--------------------");

		//Sort List<String>
		
		System.out.println("Sort List<String>");

		studentsName.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------");

		//Conditionally apply Filter condition, say if flag is enabled then
		 
		boolean sortConditionFlag = true;

		Stream<Student> conditionalFilterResult = students.stream().filter(std -> std.getName().startsWith("J"));

		if (sortConditionFlag) {
			conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
		}

		System.out.println("Before sorting :");
		students.forEach(s -> System.out.println(s.getName()));

		List<Student> list = conditionalFilterResult.collect(Collectors.toList());
		System.out.println("After filter and conditional sorting :");
		list.forEach(s -> System.out.println(s.getName()));

	}
}