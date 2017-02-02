public class StudentRunner
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student(15,9);
		Student	s3 = new Student(17,11,"Neil");
		Student s4 = new Student();

		s4.setName("Dylan");
		s4.setAge(18);
		s4.setGrade(12);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s2.getAge());
		System.out.println(s3.getGrade());
		System.out.println(s3.getName());
		System.out.println(Student.getNumStudents());
		System.out.println(s1.older(s2));
		System.out.println(Student.older(s3, s1));
	}


}