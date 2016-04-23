package grade;

public class GradeBean {
	// === 멤버필드영역(스코프) ===
	private int kor, eng, math, java;
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setJava(int java){
		this.java = java;
	}
	public int getJava(){
		return java;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	// === 멤버메소드 영역(스코프) ===
	
}
