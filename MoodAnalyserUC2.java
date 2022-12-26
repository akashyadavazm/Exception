package moodAnalyserProblem;

public class MoodAnalyserUC2 {

	public void analyseMood(String mood) {
		try {
			if (mood.equals("Sad mood")) {
				System.out.println("SAD");
			}
		} catch (NullPointerException e) {
			System.out.println("Happy");
		}
	}

	public static void main(String[] args) {
		MoodAnalyserUC2 ma = new MoodAnalyserUC2();
		ma.analyseMood(null);
	}
}
