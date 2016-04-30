package loto;

public interface LottoService {
	public void setLottos(LottoBean bean); //abstract 생략가능 - 추상화 (public abstract void setLottos(LottoBean lotto))
	public int[][] getLottos();
	public boolean isDuplication(int count, int num);
	public void sort(int[] arr);
	public void setCount(LottoBean bean);
	public int getCount();
}
