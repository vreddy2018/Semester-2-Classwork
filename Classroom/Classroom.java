public class Classroom
{
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	
	private Student[] section;
	
	
	public Classroom()
	{
		this(new Student(),  new Student(15,9), new Student(17,11,"Neil"), new Student(18,12,"Dylan"));
		
		section = new Student[13];
		section[0] = new Student;
	
	}

	public Classroom(Student st1,Student st2,Student st3,Student st4)
	{
		s1 = st1;
		s2 = st2;
		s3 = st3;
		s4 = st4;
	}
	
	
	public Student getS1()
	{
		return s1;
	}
	public Student getS2()
	{
		return s2;	
	}
	public Student getS3()
	{
		return s3;
	}
	public Student getS4()
	{
		return s4;	
	}
	
	
	//modifiers
	public void setS1(Student s)
	{
		s1=s;
	}
	public void setS2(Student s)
	{
		s2=s;
	}
	public void setS3(Student s)
	{
		s3=s;
	}
	public void setS4(Student s)
	{
		s4=s;
	}
	
	
	public String toString()
	{
		return s1.toString()+ " " + s2.toString() + " " + s3.toString() + " " + s4.toString();
	
	}
}