import java.util.HashMap;
import java.util.Map;

public class Average_Calculator_Map {

	public static void main(String[] args) {
		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("����", 100);
		score.put("����", 90);
		score.put("����", 55);
		score.put("���α׷���", 90);
		
		int math = score.get("����");
		int phy = score.get("����");
		int en = score.get("����");
		int prog = score.get("���α׷���");
		
		double avg = (double)(math + phy + en + prog) / 4;
		
		System.out.println("��� : " + avg);
	}

}
