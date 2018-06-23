package com.scp.serialization;

public class Student {
		int studId;
		String studName;
		String address; //4 /7
		static String collegeName; //1

		public static void main(String[] args) {
			System.out.println("inside student main method...!");//3
			Student st1 = new Student(10,"A","Pune");
			Student st2 = new Student(11,"B","Mumbai"); 
			System.out.println(st1);
			System.out.println(st2);
		
			
			
			
			staticMethod();
			st1.instanceMethod();
		
		}
		
		//Object representation
		@Override
		public String toString() {
			return "Student [studId=" + studId + ", studName=" + studName
					+ ", address=" + address + "]";
		}


		public Student(int studId, String studName, String address) {
			System.out.println("inside pconstructor..");//6/9
			this.studId = studId;
			this.studName = studName;
			this.address = address;
		}

		public void instanceMethod(){
			System.out.println("instance method");
		}
		
		static public void staticMethod(){
			System.out.println("static method"); //2
		}
		
		static{
			System.out.println("static field initialization");
			System.out.println("inside static block");
		}
		{
			System.out.println(" instance field initialization");
			System.out.println("instance block");//5/8
		}
		
	
}

/**
 * Only if none of constructor is defined inside your class then only
 * java compiler will add default constructor in your file
 * 
 * 
 * if any of the constructor -- No args/Parameteried added explicitly then
 * java compiler is not going to add any of the constructor
 * 
 *  if(no construcotor){
 *  		add default constructor
 *  }else {
 *  	dont add
 *  }
 * 
 * 
 *
 *
javac Student.java -- Eclipse
java Student

ClassLoaded --
		BootStrap -- All Java bootstraping required jars will be loaded into memory
		Application -- All User defined classes will be loaded in to memory
		Extension - from /ext folder jars will be loaded

Static fields scanning -- Memory will be allocated on Method area

static field initialization
inside static block
inside student main method...!
 instance field initialization    -- On heap inside Object
instance block
inside pconstructor..
 instance field initialization   -- On heap inside Object
instance block
inside pconstructor..
Student [studId=10, studName=A, address=Pune]
Student [studId=11, studName=B, address=Mumbai]

 * 
 *  
 *  StaticBlock -- It's prequisites for class loading -- agar muze class
 *  loading time kuch karnawana hai den that code shud be written inside static blck
 * 
 *  InstanceBlock -- It's prequisites for Object Creation -- agar muze object banate time (for each object)
 *   kuch karnawana hai den that code shud be written inside instance blck
 * 
 * instance block/static block are called by Jvm -- 
 * main -- jvm 
 * 
 * 
 * static and instance method are written for the purpose to achive our
 * business --- those shud be called by developer
 * 
 * static -- agar har object k liye business same hota hai 
 * instance -- har object ka business alag rahega to
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  kaunsa block/area    kaunsa field 
 * 
 * static area  --- Instance fields -- ORR    = main -- id  == st1.id/st2.id
 * static area  -- static field  -- Direct Accessible
 * instancearea -- static field -- direct accessible
 * instance area -- instance fields -- direct accessible
 * 
 * ss- direct
 * ii -driect
 * is -direct
 *si- ORR
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



