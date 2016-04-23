package kaup;

public class KaupBean {
	// ----------------------------
	private double weight, height;
	private String name;
	// ALT + SHIFT + S (겟터 앤 셋터 자동 생성)
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	// ----------------------------
}
