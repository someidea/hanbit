package kaup;

public class KaupServiceImpl implements KaupService{

	@Override
	public int getIndex(KaupBean kaup) {
		return (int)((kaup.getWeight()/(kaup.getHeight()*kaup.getHeight())*10000)); // 중복되서 받기 때문에 한 번에 처리
	}

	@Override
	public String getResult(int index) {
		String result = "";
		if (index >= 30) {
			result = "비만";
		} else if(index >=24) {
			result = "과체중";
		} else if(index >= 20) {
			result = "정상";
		} else if(index >= 15) {
			result = "저체중";
		} else if(index >= 13) {
			result = "마름";
		} else if(index >= 10) {
			result = "영양실조";
		} else{
			result = "소모증";
		}
		return result;
	}
}
