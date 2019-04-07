package org.greens.std;
public class Studentlib {
	public void StudentID() {
		int ID=101;
		System.out.println("StudentID:"+ID);
			}
	public void studentName() {
		String s="Vells";
		System.out.println("StudentName:"+s);
	}
	public void studentMarks() {
		int Total=4;
		int Science= 82;
		int CG=75;
		int OS=65;
		int Maths=85;
		int sum=Science+CG+OS+Maths;
		System.out.println("AverageMarks:"+sum/Total);
			}
	public static void main(String[] args) {
		Studentlib s=new Studentlib();
		s.StudentID();
		s.studentName();
		s.studentMarks();
		
		
	}

}
