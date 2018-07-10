package by.htp.future.entity;

public class PredictionResult {
	private Answer answer;
	private Prediction prediction;
	
	public PredictionResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PredictionResult(Answer answer, Prediction prediction) {
		super();
		this.answer = answer;
		this.prediction = prediction;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Prediction getPrediction() {
		return prediction;
	}
	public void setPrediction(Prediction prediction) {
		this.prediction = prediction;
	}
	@Override
	public String toString() {
		return "PredictionResult [answer=" + answer + ", prediction=" + prediction + "]";
	}
	

}
