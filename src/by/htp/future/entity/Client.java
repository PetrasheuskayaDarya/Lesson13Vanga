package by.htp.future.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Client implements Comparable <Client> {
	private String clientName;
	private Date date;
	private TreeMap <Date, PredictionResult> resultOfPredictions;
	
	
	public Client() {
		super();
		this.resultOfPredictions = new TreeMap<Date, PredictionResult>();
	}
	
	public Client(String clientName, Date date) {
		this.clientName = clientName;
		this.date = date;
		
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TreeMap<Date, PredictionResult> getResultOfPredictions() {
		return resultOfPredictions;
	}

	public void setResultOfPredictions(TreeMap<Date, PredictionResult> resultOfPredictions) {
		this.resultOfPredictions = resultOfPredictions;
	}


	public void showTopicsForPrediction (Prediction[] predictions) {
		for (Prediction p : predictions) {
			System.out.println(p);
		}
	}
	
	public void showHistoryOfVisits(Date date, PredictionResult predictionResult) {
		resultOfPredictions.put(date, predictionResult);
	}
		



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((resultOfPredictions == null) ? 0 : resultOfPredictions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (resultOfPredictions == null) {
			if (other.resultOfPredictions != null)
				return false;
		} else if (!resultOfPredictions.equals(other.resultOfPredictions))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Client [name=" + clientName + ", dateOfVisit="
				+ new SimpleDateFormat("dd.MM.yy").format(date) + "]";
	}


	@Override
	public int compareTo(Client o) {
		return clientName.compareTo(o.clientName);
	}
	
}
