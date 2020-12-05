package practice;

public class DigitalPond {
	
	private int[][] pond = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	
	public static void main(String[] args) {
		
		DigitalPond digitalPond = new DigitalPond();
		digitalPond.iteration(digitalPond);
		
		for (int i = 0; i < digitalPond.pond.length; i++) {
			for (int j = 0; j < digitalPond.pond.length; j++) {
				System.out.print(digitalPond.pond[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void iteration(DigitalPond digitalPond) {
		for (int i = 0; i < digitalPond.pond.length; i++) {
			for (int j = 0; j < digitalPond.pond.length; j++) {
				
				if (digitalPond.pond[i][j] >= 1 && i > 0 && j > 0) {
					if (digitalPond.pond[i][j] <= digitalPond.pond[i-1][j] && digitalPond.pond[i][j] <= digitalPond.pond[i+1][j] && 
							digitalPond.pond[i][j] <= digitalPond.pond[i][j-1] && digitalPond.pond[i][j] <= digitalPond.pond[i][j+1]) {
						digitalPond.pond[i][j] += 1;
						iteration(digitalPond);
					}
				}
			}
		}
	}
	
}
