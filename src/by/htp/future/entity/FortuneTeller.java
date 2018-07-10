package by.htp.future.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class FortuneTeller {
	
	private int countOfClients;
	private Map<Prediction, Queue<Answer>> predictionAnswers;
	private PriorityQueue<Client> queueOfClients;
	private HashMap<Date, Client> recordOfClient;
	

	public FortuneTeller() {
		super();
		
	}

	public FortuneTeller(Map<Prediction, Queue<Answer>> predictionAnswers, PriorityQueue<Client> queueOfClients,
			HashMap<Date, Client> recordOfClient, int counter) {
		super();
		this.predictionAnswers = predictionAnswers;
		this.queueOfClients = queueOfClients;
		this.recordOfClient = recordOfClient;
		this.countOfClients = counter;
	}


	public Map<Prediction, Queue<Answer>> getPredictionAnswers() {
		return predictionAnswers;
	}


	public void setPredictionAnswers(Map<Prediction, Queue<Answer>> predictionAnswers) {
		this.predictionAnswers = predictionAnswers;
	}


	public PriorityQueue<Client> getQueueOfClients() {
		return queueOfClients;
	}


	public void setQueueOfClients(PriorityQueue<Client> queueOfClients) {
		this.queueOfClients = queueOfClients;
	}


	public HashMap<Date, Client> getRecordOfClient() {
		return recordOfClient;
	}


	public void setRecordOfClient(HashMap<Date, Client> recordOfClient) {
		this.recordOfClient = recordOfClient;
	}


	public int getCounter() {
		return countOfClients;
	}


	public void setCountOfClients(int counter) {
		this.countOfClients = counter;
	}


	@Override
	public String toString() {
		return "FortuneTeller [predictionAnswers=" + predictionAnswers + ", queueOfClients=" + queueOfClients
				+ ", recordOfClient=" + recordOfClient + ", counter=" + countOfClients + "]";
	}
	
	public void showListOfClientsInQueue (PriorityQueue<Client> queueOfClients) {
		for (int i = 0; i < queueOfClients.size(); i++) {
			System.out.println(queueOfClients.peek());
		}
		} 
	public void LookAtHistoryOfClients( HashMap <Date, Client> recordOfClient) {
//		Set set = recordOfClient.keySet();
//		for(Object o: set) {
//			System.out.println(o);
		System.out.println(recordOfClient);
			
	}
	

	

 }

