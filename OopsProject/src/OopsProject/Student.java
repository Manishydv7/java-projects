/*In this project there are two classes Student and StudentMain in which Student class consist four
 * data members, constructors, getter/setter and toString() method.
 * and in the class StudentMain we are creating 3 objects of Student and setting and printing there
 * values.
 * @Manishyadav
*/
package OopsProject;

//class Student
public class Student 
{
	//creating four data members
	final static String institute_name="Anudip Foundation";
	private int rollno;
	private String name;
	private int age;
	//default constructor
	public Student() 
	{
		super();
	}
	
	public Student(int rollno, String name, int age) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getInstituteName() {
		return institute_name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
}
