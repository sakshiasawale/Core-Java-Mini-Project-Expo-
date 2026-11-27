package course;

public class StudentAdmin {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		
		student.sid=20;
		student.sname="Abc";
		
		student.batch.bid=30;
		student.batch.bname="PQR";
		
		student.batch.faculty.fid=300;
		student.batch.faculty.fname="Xyz";
		
		student.batch.faculty.course.cid = 200;
		student.batch.faculty.course.cname ="Sab";
		
		
		student2.sid =100; 
		student2.sname="Omega";
		
		student2.batch.bid=35;
		student2.batch.bname="B77";
		
		student2.batch.faculty.fid=55;
		student2.batch.faculty.fname="Amit";
		
		student2.batch.faculty.course.cid = 67;
		student2.batch.faculty.course.cname ="Mango";
		
		System.out.println("Student Details : "+student.sid+" "+student.sname);
		System.out.println("Student2 Details : "+student2.sid+" "+student2.sname);
		
		
		System.out.println("Batch Details : "+student.batch.bid+" "+student.batch.bname);
		System.out.println("Batch Details : "+student2.batch.bid+" "+student2.batch.bname);
		
		
		System.out.println("Faculty Details : "+student.batch.faculty.fid+" "+student.batch.faculty.fname);
		System.out.println("Faculty Details : "+student2.batch.faculty.fid+" "+student2.batch.faculty.fname);
		
		System.out.println("Course Details : "+student.batch.faculty.course.cid+" "+student.batch.faculty.course.cname);
		System.out.println("Course Details : "+student2.batch.faculty.course.cid+" "+student2.batch.faculty.course.cname);
	}
}

