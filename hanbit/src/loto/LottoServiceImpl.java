package loto;

public class LottoServiceImpl implements LottoService {
	private int[][] lottos;
	private int[] lotto;  // 돈과 상관없이 생성되는 한 줄(숫자 6) 로또
	private int count;
	
	public void setCount(LottoBean bean){
		this.count = bean.getMoney()/1000;
	}
	
	public int getCount() {
		// 몇 장을 출력할 것인지 결정
		return count;
	}
	
	public void setLottos(LottoBean bean) {
		// 로또번호 만들기(2, 14, 21, 31, 39, 45) X 입력된 돈만큼
		setCount(bean);
		this.lottos = new int[count][6]; // 초기화  /  this. 생략 가능
		this.lotto = new int[6];
		int i = 0;
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while(true){
					int num = bean.getNum();
					if (isDuplication(count, num)) {
						continue;
					}
					this.lottos[count][i] = num;
					i++;
					if (i==lottos[count].length) {
						i = 0;
						break;
					}
				}
			}
		}
	}
	
	public int[][] getLottos() {
		// 만들어진 로또 번호 가져오기
		return lottos;
	}
	
	public boolean isDuplication(int count, int num) {
		// 중복된 번호인지 체크(중복이면 true 리턴)
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[count][i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public void sort(int[] lotto) {
		// 오름차순으로 정렬
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - i - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];  // 스왑정렬
					lotto[j] = lotto[j + 1];  // 스왑정렬
					lotto[j + 1] = temp;  // 스왑정렬
				}
			}
		}
	}
}
