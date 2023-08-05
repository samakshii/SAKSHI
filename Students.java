package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	String name;
	int rollnumber; 
	String grade;
	static ArrayList<Students> StudentList = new ArrayList<Students>();
	static Scanner myObj = new Scanner(System.in);
	public Students(String name, int rollnumber, String grade) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollnumber=rollnumber;
		this.grade=grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;int op=0;
		Students A1=new Students("AAAA",1,"A");
		Students A2=new Students("BBBB",2,"B");
		Students A3=new Students("CCCC",3,"C");
		StudentList.add(A1);
		StudentList.add(A2);
		StudentList.add(A3);
		System.out.println("All Students Details:");
		ShowAll();
		do{
			System.out.println("\nEnter the choice of operation\n1.Add Student\n2.Delete Student\n3.show all Student data\n4.Search Details by Roll number");
			op = myObj.nextInt();
			switch(op)
			{case 1:
				System.out.println("\nAdd new Student Record");
				AddStudent();
				ShowAll();
				break;
			case 2:
				DeleteStudent();
				ShowAll();
				break;
			case 3:
				ShowAll();
				break;
			case 4:
				Search();
				break;
			default:
				System.out.println("\nInvalid Choice");
				break;
				}
			System.out.println("\nDo you want to continue(y/n)");
		a=myObj.next();
		}while(a.equals("y"));
	}
	static void AddStudent() {
		System.out.println("Enter new Student's name");
        String TempName = myObj.next();
        System.out.println("Enter a new Roll number");
        int TempRoll = myObj.nextInt();
        System.out.println("Enter a new Student's grade");
        String TempGrade = myObj.next();
        boolean Temp=true;
		for(Students B:StudentList) {
			if(B.rollnumber==TempRoll) {
				System.out.println(B.rollnumber+" Roll number already exists");
				Temp=false;
			}
		}
		
		if(Temp){
			Students foo = new Students(TempName,TempRoll,TempGrade);
			StudentList.add(foo);
			System.out.println("New Students Details Saved");
		}
	}
	static void DeleteStudent() {
		System.out.println("\nExisting Students:\n");
		for(Students AB:StudentList) {
			System.out.println(AB.name+" "+AB.rollnumber+" "+AB.grade);
		}
        System.out.println("Enter a Roll number to delete");
        int TempRoll = myObj.nextInt();
        boolean Temp=true;
        for(Students B:StudentList) {
			if(B.rollnumber==TempRoll) {
				System.out.println(B.rollnumber+" Roll number exists");
				StudentList.remove(B);
				System.out.println(TempRoll+" Roll number Deleted");
				Temp=false;
				return;
			}
		}      
		if(Temp) {
			System.out.println("No record Exixts");
		}
	}
	static void ShowAll() {
		System.out.println();
		for(Students AB:StudentList) {
			System.out.println(AB.name+" "+AB.rollnumber+" "+AB.grade);
		}  

		System.out.println();
	}
	static void Search() {
		System.out.println("Enter a Roll number to search");
        int TempRoll = myObj.nextInt();
        boolean Temp=true;
        for(Students B:StudentList) {
			if(B.rollnumber==TempRoll) {
				System.out.println(B.rollnumber+" Roll number exists");
				System.out.println(B.name+" "+B.rollnumber+" "+B.grade);
				Temp=false;
				return;
			}
		}      
		if(Temp) {
			System.out.println("No record Exixts");
		}
	}
}

