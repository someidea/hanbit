package loto;

public class LottoBean {
	private int money, num;
	// ALT + SHIFT +S + R
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNum() {
		setNum();  // this. 생략
		return num;
	}
	public void setNum() {
		this.num = (int) (Math.random()*45+1);
	}
}
