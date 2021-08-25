import java.util.HashMap;
import java.util.Map;

public class Average_Calculator_Map {

	public static void main(String[] args) {
		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("수학", 100);
		score.put("물리", 90);
		score.put("영어", 55);
		score.put("프로그래밍", 90);
		
		int math = score.get("수학");
		int phy = score.get("물리");
		int en = score.get("영어");
		int prog = score.get("프로그래밍");
		
		double avg = (double)(math + phy + en + prog) / 4;
		
		System.out.println("평균 : " + avg);
	}

}
