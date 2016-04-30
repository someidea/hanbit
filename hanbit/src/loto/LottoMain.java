package loto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LottoBean bean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		System.out.println("얼마치를 구입하십니까?");
		bean.setMoney(scanner.nextInt());
		service.setLottos(bean);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
