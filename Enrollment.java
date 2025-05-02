public class Enrollment {
	public String getEnrollmentInfo(String platform , String course , String student){
		return "Platform : " + platform + "\n" + "Course : " + course + "\n" + "Student : " + student + "\n" + "---------------------------";
}
	public static void main(String [] args){
		Enrollment enrollment = new Enrollment();
		String info1 =enrollment. getEnrollmentInfo("Udemy" , "Java Programming" , "Alice");
		System.out.println(info1);
		String info2 = enrollment.getEnrollmentInfo("Udemy" , "Web Development" , "Bob");
		System.out.println(info2);

}
}

