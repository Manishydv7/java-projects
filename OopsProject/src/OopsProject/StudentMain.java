package OopsProject;
// class StudentMain 
public class StudentMain 
{
	public static void main(String args[])
	{
		//Creating 3 objects of Student class
		Student s1=new Student(101,"Manish",23);
		Student s2=new Student(102,"Akash",24);
		Student s3=new Student(103,"Prince",24);
		
		//Invoking the method from  s1 object 
		System.out.println("The institute of the Student is : "+s1.getInstituteName());
		System.out.println("The rollno. of the Student is : "+s1.getRollno());
		System.out.println("The name of the Student is : "+s1.getName());
		System.out.println("The age of the Student is : "+s1.getAge()+"\n");
		//Invoking the method from  s2 object 
		System.out.println("The institute of the Student is : "+s2.getInstituteName());
		System.out.println("The rollno. of the Student is : "+s2.getRollno());
		System.out.println("The name of the Student is : "+s2.getName());
		System.out.println("The age of the Student is : "+s2.getAge()+"\n");
		//Invoking the method from  s3 object 
		System.out.println("The institute of the Student is : "+s3.getInstituteName());
		System.out.println("The rollno. of the Student is : "+s3.getRollno());
		System.out.println("The name of the Student is : "+s3.getName());
		System.out.println("The age of the Student is : "+s3.getAge()+"\n");
	}
}
