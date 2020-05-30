
public class Quiz_Student {
// 여기는 객체 데이터!!
		String name;
		int koreanScore;
		int mathScore;
		int englishScore;
		int sumScore;
		double avgScore;
		
//		이게 바로 생성자		
		Quiz_Student (String name, int koreanScore, int mathScore, int englishScore) {
			this.name = name;
			this.koreanScore = koreanScore;
			this.mathScore = mathScore;
			this.englishScore = englishScore;
			this.sumScore = koreanScore + mathScore + englishScore;
			this.avgScore = (double)this.sumScore / 3;			
		}

	}



