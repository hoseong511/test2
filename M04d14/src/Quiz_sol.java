
public class Quiz_sol {

// 여기는 객체 데이터!!
		String name;
		int koreanScore;
		int mathScore;
		int englishScore;
		int sumScore;
		double avgScore;
		int level = 1;
		
//		이게 바로 생성자		
		Quiz_sol (String name, int koreanScore, int mathScore, int englishScore) {
			this.name = name;
			this.koreanScore = koreanScore;
			this.mathScore = mathScore;
			this.englishScore = englishScore;
			this.calc();
					
		}
//		메서드로 출력해보기
		public void printInfo() {
			System.out.println("이름: " + this.name);
			System.out.println("국어 점수 : " + this.koreanScore);
			
		
		}
//		계산 영역을 따로 빼놓기
		public void calc() {
			this.sumScore = this.koreanScore + this.mathScore + this.englishScore;
			this.avgScore = (double)sumScore / 3;
		}
//		메서드로 순위 출력해보기
		public void printLevel(Quiz_sol[] s) {
			for(int i = 0; i < s.length; i++) {
				if (this.sumScore <= s[i].sumScore) {
					this.level++;
					
				}
			}
		}

	}






