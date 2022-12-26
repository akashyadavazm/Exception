package moodAnalyserProblem;

@SuppressWarnings("serial")
class MoodAnalysisException extends Exception {

	public MoodAnalysisException(String mood) {
		super(mood);
	}
}

public class MoodAnalyserUC3 {

	public void analyseMood() throws MoodAnalysisException {
		try {
			throw new MoodAnalysisException(" ");
		} catch (MoodAnalysisException e) {
			if (e.getMessage().equals(" ")) {
				System.out.println("Empty Mood");
			} else {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void main(String[] args) throws MoodAnalysisException {
		MoodAnalyserUC3 ma = new MoodAnalyserUC3();
		ma.analyseMood();
	}
}
