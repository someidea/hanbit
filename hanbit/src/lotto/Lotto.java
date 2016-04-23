package lotto;

public class Lotto {
	private int money;
	private int[][] lottos; 
	int[][] arr;
	
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	public void setLottos(int money){
		// 2중 배열(lottos)에 this.generateRandomNum()를 사용하여
		// 랜덤 배열에 담는 코드 완성
		int count = this.count(money);
		this.lottos = lottos;
	}
	public int[][] getLottos(){
		return lottos;
	}
	
	public void inputMoney(int money){
		this.money = money;
		lottos = new int[money/1000][6];
	}
	public int generateRandomNum(){
		// 로또의 랜덤 숫자 생산
		int randomNum = 0;
		// 코드 완성 !
		return randomNum;
	}
	public boolean isDuplication(int num){
		// 로또 번호의 중복여부 체크
		boolean result = false; // 불린타입의 초기화는 거짓
		// 코드 완성 !
		return result;
	}
	public void sort(int[] arr){
		// 로또 번호의 오름차순으로 정렬하기
		// 25, 4, 30, 1, 11 ----> 1, 3, 11, 25, 30
		// 2중 for - loop 사용 + SWAP 정렬
		// 코드 완성 !
	}
	public int count(int money){
		int count = 0;
		if (money < 1000) {
			return count;
		}
		return (int) Math.ceil(money/1000);
	}
}
