package moodAnalyserProblem;

public class MoodAnalyserUC1 {

	public void analyseMood(String mood) {
		if (mood.equals("I am Happy")) {
			System.out.println("HAPPY");
		} else {
			System.out.println("SAD");
		}
	}

	public static void main(String[] args) {
		MoodAnalyserUC1 ma = new MoodAnalyserUC1();
		ma.analyseMood("I am Happy");
		ma.analyseMood(null);
	}
}
