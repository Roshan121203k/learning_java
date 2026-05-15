CONTAINMENT EXAMPLE

public class DEPARTMENT {
	
	private String deptName;
	private int deptId;
		
	public DEPARTMENT(){
		System.out.println("Default constructor of DEPARTMENT is called");
		deptName="";
		deptId=0;
	}
	
	public DEPARTMENT(String deptName,int deptId){
		System.out.println("Parametesied constructor of DEPARTMENT is called");
		this.deptName=deptName;
		this.deptId=deptId;
	}
	
	public void displayDEPARTMENT()
	{
		System.out.println("displayDEPARTMENT from DEPARTMENT is called");
		System.out.println("DEPT NAME "+deptName);
		System.out.println("DEPT ID "+deptId);		
	}

}



public class ORAGANIZATION {
	private String orgName;
	private String orgLocation;
	private DEPARTMENT account;

	public ORAGANIZATION(){
		account=new DEPARTMENT();
		System.out.println("Default constructor of ORGANIZATION IS CALLED");
	}

	public ORAGANIZATION(String orgName,String orgLocation,String deptName,int deptId){
		System.out.println("Parameterised constructor of ORGANIZATION IS CALLED");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		account=new DEPARTMENT(deptName,deptId);
	}

	public void displayOraganization(){
		System.out.println("displayOraganization");
		System.out.println("Oraganization Name   "+orgName);
		System.out.println("Oraganization Location  " +orgLocation);
		account.displayDEPARTMENT();
	}

}



ARRAY LIST EXAMPLE
import java.util.*;
import javax.swing.*;
public class ArrayListDEMO {

	private ArrayList<Integer> lst;

	public ArrayListDEMO(){
		System.out.println("Default constructor of ArrayListDEMO");
		lst=new ArrayList<Integer>();
	}

	public void addElement(int element){
		System.out.println("addElement is called");
		lst.add(element);
	}

	public void diplayValues(){
		for (int i=0;i<lst.size();i++){
			System.out.println(lst.get(i));

		}
	}

	public static void main(String[] args) {

		ArrayListDEMO ar=new ArrayListDEMO ();
		int res;
		do
		{
			System.out.println("1] Add\n2] Display\n");
			System.out.println("Enter your Choice");

			int iChoice=Integer.parseInt(JOptionPane.showInputDialog("Enter your choice"));

			switch (iChoice) {
			case 1:
				int ele=Integer.parseInt(JOptionPane.showInputDialog("Enter element"));
				ar.addElement(ele);
				break;

			case 2:
				ar.diplayValues();
				break;

			default:
				System.out.println("Invalied Choice");
			}
			System.out.println("Do u want to cont...(1/0)");
			res=Integer.parseInt(JOptionPane.showInputDialog("Do you want to cont..."));
		}while(res==1);

	}

}


POLYMORPHISM DEMO

public class A {
	public void show(){
		System.out.println("Show from class A");
	}
		
}
public class B extends A{
	public void show(){
		System.out.println("show() from class B");
	}
}

public class C extends B{
		public void show(){
			System.out.println("show() from class C");
		}
	}

public class polyDemo {
	public static void main(String[] args) {
		
		A aObj=new A();
		aObj.show();
		
		aObj=new B();
		aObj.show();
		
		aObj=new C();
		aObj.show();
		
		
		
		
		
		
		
		
		
		
/*		A v1 = new B(); 
		v1.show();
		
		A v2=new B();
		 
		B c1 = (B)v1;  
		c1.show();
		
		B c2 = (B)v2; //Wrong. Runtime exception ClassCastException 
		//v2 has no knowledge of B. 
		
		/*Bus b1 = new C(); //Wrong. compile time error "Type Mismatch"
		B c3 = new C(); //Right.upcasting or implicit casting 
		B c4 = (C)v1; //Wrong. Runtime exception ClassCastException 
*/


		
		
		
	}

}




zORGANIZATION EXAMPLE
import java.io.*;
public class MyDATE {
	private int day;
	private int month;
	private int year;

	public MyDATE(){
		System.out.println("Default cosntructor of MyDATE is called");
		day=month=year=0;
	}
	public MyDATE(int day,int month,int year){
		System.out.println("Parameteised cosntructor of MyDATE is called");
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public void acceptDATE() throws NumberFormatException, IOException{
		System.out.println("acceptDATE is called");
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		day=Integer.parseInt(input.readLine());
		month=Integer.parseInt(input.readLine());
		year=Integer.parseInt(input.readLine());
	}
	
	public void displayDATE(){
		System.out.println("displayDATE is called");
		System.out.println(" "+day+"/"+month+"/"+year);
	}

}



import java.io.*;
public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	private MyDATE DOB;  //CONTAINMENT 
	
	public Employee(){
		System.out.println("Default constructor of Employee is called");
		empId=0;
		name="";
		salary=0;
		DOB=new MyDATE();  ///DEFAULT CONSTRUCTOR OF MyDATE
	}
	
	public Employee(int empId,String name,double salary,int day,int month,int year){
		System.out.println("Parameterised constructor of Employee is called");
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		DOB=new MyDATE(day,month,year); //PARAMETERISED OF MyDATE
	}
	
	//getters
	public double getSalary(){
		return salary;
	}
	
	public void acceptEmployeeDetails() throws NumberFormatException, IOException{
		
		System.out.println("acceptEmployeeDetails() is called");
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter empId,name,salary");
		empId=Integer.parseInt(input.readLine());
		name=input.readLine();
		salary=	Double.parseDouble(input.readLine());
		System.out.println("Enter Date Of Birth");
		DOB.acceptDATE();
	}
	
	public void calculateSalary(){
		System.out.println("calculateSalary() from Employee");
	}
	
	public void displayEmployeeDetails(){
		System.out.println("displayEmployeeDetails is called");
		System.out.println("EmpId= "+empId+"   name= "+name+"   Salary "+salary);
		DOB.displayDATE();
	}
	
}



import java.io.*;
public class SalesEmployee extends Employee{

	private int sales;
	private double commission;
	private double netSalary;

	public SalesEmployee(){
		System.out.println("Default constructor of SalesEmployee is called");
		sales=0;
		commission=0;
		netSalary=0;
	}

	public SalesEmployee(int empId,String name,double salary,int day,int month,int year,int sales){
		super(empId,name,salary,day,month,year); //this calles parameterised constructor of super class
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales=sales;
		commission=0;
		netSalary=0;
	}

	public void acceptSalesEmployeeDetails() throws NumberFormatException, IOException{
		System.out.println("acceptSalesEmployeeDetails() is called");
		super.acceptEmployeeDetails();
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sales amount");
		sales=Integer.parseInt(input.readLine());
	}

	public void calculateSalary(){
		System.out.println("calculateSalary() from SalesEmployee is called");
		/*(sales <5000){ 
			commission=super.getSalary()*0.02;
		}
		else if (sales >=5000 && sales<7000){
			commission=super.getSalary()*0.05;
		}
		else if (sales >=7000 && sales<10000){
			commission=super.getSalary()*0.07;
		}
		else if (sales >=10000 && sales<12000){
			commission=super.getSalary()*0.10;
		}
		else if (sales >=12000 && sales<15000){
			commission=super.getSalary()*0.12;
		}
		else if (sales >=15000){
			commission=super.getSalary()*0.15;
		}
		else
			System.out.println("commission is not allowed");

		netSalary=super.getSalary()+commission;
*/
	}

	public void displaySalesEmployeeDetails(){
		super.displayEmployeeDetails();
		System.out.println("displaySelesEmployeeDetails() is called");
		System.out.println("Sales  = "+sales);
		System.out.println("Commission = "+commission);
		System.out.println("Net Salary = "+netSalary);
	}
}



import java.io.IOException;
import java.util.*;
public class MumbaiBranch {
	public static void main(String[] args) throws NumberFormatException, IOException {


		Employee e1=new Employee(101,"Pappu",1000,12,2,2000);
		e1.displayEmployeeDetails();
		
		
		/*ArrayList<Employee> database=new ArrayList<Employee>();

		Employee e1=new Employee(101,"pappu",10000);
		Employee e2=new Employee(102,"banti",20000);
		Employee e3=new Employee(103,"munni",30000);
		Employee e4=new Employee(104,"chutki",40000);
		Employee e5=new Employee(105,"anu",50000);

		database.add(e1);
		database.add(e2);
		database.add(e3);
		database.add(e4);
		database.add(e5);
		
		Employee e6=new Employee(106,"chintu",60000);
		database.add(e6);
		
		for(int i=0;i<database.size();i++){
			database.get(i).displayEmployeeDetails();
		}
		*/
	
	}
}





UPCASTING AND DOWNCASTING



Vehicle v1 = new Car(); //Right.upcasting or implicit casting

Vehicle v2 = new Vehicle(); 

Car c0 = v1; //Wrong. compile time error "Type Mismatch". 
//Explicit or down casting is required 

Car c1 = (Car)v1; // Right. down casting or explicit casting. 

// v1 has knowledge of Car due to line1

Car c2 = (Car)v2; //Wrong. Runtime exception ClassCastException 
//v2 has no knowledge of Car. 

Bus b1 = new Alto(); //Wrong. compile time error "Type Mismatch"

Car c3 = new Alto(); //Right.upcasting or implicit casting 

Car c4 = (Alto)v1; //Wrong. Runtime exception ClassCastException 

Object o = v1; //v1 can only be upcast to its parent or 

Car c5 = (Car)v1; //v1 can be down cast to Car due to line 1.



abstract public class Employee† 
{
† public Employee(String name)† 
{ 
setName(name); 
†† }
† public String getName()†
 { 
 return new String(name); 
†† }
private void setName(String name)† 
{ 
this.name = new String(name);
† } 
abstract public double pay(); 
 † public String toString()†
 {
return "name is " + name;
}
 private String name;
}



public class Salaried extends Employee† { 
public Salaried(String name, double salary)† 
{ 
super(name);
setSalary(salary); }
 public void setSalary(double salary)† 
{
 this.salary = salary;
}
public double getSalary()† 
{
 return salary;} 
public double pay()†
 { 
return salary; 
}
 public String toString()†
 {
return super.toString() + " (salary is " + salary + ")";
} 
†† double salary; 
}

†





1. Static Variable
A static variable is shared across all objects.

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}

Output:

Count: 1
Count: 2
Count: 3


2. Static Method
A static method belongs to the class and can be called without creating an object.

class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(5);
        System.out.println(result);
    }
}


3. Static Block
Used to initialize static data. Runs once when the class is loaded.

class Demo {
    static int num;

    static {
        num = 100;
        System.out.println("Static block executed");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Demo.num);
    }
}

Output:

Static block executed
100


4. Static Nested Class
A class inside another class, declared static.

class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}


5. Static Import (Bonus)
Allows using static members without class name.

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
        System.out.println(pow(2, 3));
    }
}


Key Points
* Static = belongs to class, not object
* Memory allocated once
* Can access only static members directly
* Common for utility/helper methods

If you want, I can give you tricky interview questions on static or real-world use cases.

more examples

Here are some more practical and slightly advanced static examples in Java so you can really understand how it behaves in real scenarios:

6. Static vs Non-Static (Important Difference)

class Student {
    static String school = "ABC School";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies in " + school);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        s1.display();
        s2.display();
    }
}


7. Static Method Calling Static & Non-Static

class Test {
    static void staticMethod() {
        System.out.println("Static method");
        // nonStaticMethod(); 
    }

    void nonStaticMethod() {
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        staticMethod();

        Test obj = new Test();
        obj.nonStaticMethod(); 
    }
}


8. Static Counter for Object Tracking (Real Use Case)

class Employee {
    static int totalEmployees = 0;

    Employee() {
        totalEmployees++;
    }

    static void showTotal() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Main {
    public static void main(String[] args) {
        new Employee();
        new Employee();
        new Employee();

        Employee.showTotal();
    }
}


9. Static Final (Constant)

class Constants {
    static final double PI = 3.14159;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.PI);
    }
}


10. Static Block with Multiple Blocks

class Example {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}

Output:

Block 1
Block 2
Main method


11. Static Variable Shared Across Objects (Modification Effect)

class Car {
    static int wheels = 4;

    void changeWheels() {
        wheels = 6;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.changeWheels();

        System.out.println(c2.wheels);
    }
}

Output:

6


12. Static Utility Class Pattern (Very Common)

class StringUtils {
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("hello"));
    }
}


13. Static Initialization with Logic

class Config {
    static int maxUsers;

    static {
        maxUsers = (int)(Math.random() * 100);
        System.out.println("Config initialized");
    }
}


14. Static Inner Class Accessing Outer Static Members

class Outer {
    static int data = 50;

    static class Inner {
        void show() {
            System.out.println(data);
        }
    }
}
