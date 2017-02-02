public class Student
{
	//nonstatic fields
	private int age;
	private String name;
	private int grade;

	
	//static fields
	private static int numStudents;

	
	//constructors
	public Student()
	{
		this(10,10,"Bob");
	}
	
	
	public Student(int age, int grade)
	{
		this.age = age;
		this.grade = grade;
		name = "Jack";
		numStudents++;
	}
	
	public Student(int a, int g, String n)
	{
		age = a;
		grade = g;
		name = n;
		numStudents++;	
	}
	
	//accessors - with these, the above class fields can be made private 
	public int getAge()
	{
		return age;
	}
	public int getGrade()
	{
		return grade;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public static int getNumStudents()
	{
		return numStudents;
	}
	
	
	//modifiers
	public void setAge(int a)
	{
		age = a;
	}
	public void setGrade(int g)
	{
		grade = g;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	
	
	public String toString()
	{
		return name + "(" + age + " years old, " + grade + "th grade) ";
	
	}
	
	
	
	public static Student older(Student s1, Student s2)
	{
		if (s1.age>s2.age)
		{
			return s1;
		}
		else
			return s2;
	
	}
	
	public Student older(Student s1)
	{
		if (age>s1.age)
		{
			return this;
		}
		else
			return s1;
	}
	
}