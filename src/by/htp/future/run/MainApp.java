package by.htp.future.run;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;

import by.htp.future.entity.Answer;
import by.htp.future.entity.Client;
import by.htp.future.entity.FortuneTeller;
import by.htp.future.entity.Prediction;

public class MainApp {

	public static void main(String[] args) {
		
		Prediction [] prediction = { new Prediction ("Helth"), new Prediction ("Love"), new Prediction ("Mood")};
		
		
		Client client1 = new Client("Kate", new Date(22,05,22));
		
		Client client2 = new Client("Mike", new Date(22,06,22));
		
		Client client3 = new Client("Jonny", new Date(22,04,22));
		
		Client client4 = new Client("Markus", new Date(20,05,22));
		
		Client client5 = new Client("Ronny", new Date(17,01,22));
		
		client1.showTopicsForPrediction(prediction);
		
	
		PriorityQueue<Client> queueOfClients = new PriorityQueue<>();
		queueOfClients.add(client1);
		queueOfClients.add(client2);
		queueOfClients.add(client3);
		queueOfClients.add(client4);
		queueOfClients.add(client5);
		
		FortuneTeller vanga = new FortuneTeller();
		vanga.showListOfClientsInQueue(queueOfClients);
		
		HashMap <Date, Client> recordOfClient = new HashMap<>();
		Date data = new Date();
		recordOfClient.put(data, client1);
		recordOfClient.put(data, client2);
		recordOfClient.put(data, client3);
		recordOfClient.put(data, client4);
		recordOfClient.put(data, client5);
		vanga.LookAtHistoryOfClients(recordOfClient);
		
		Queue<Answer> answers0 = new ArrayDeque<>();
		answers0.add(new Answer("You will live 100 years"));
		answers0.offer(new Answer("You will not have any diseases"));
		answers0.offer(new Answer("You will leave forever"));
		
		Map<Prediction, Queue<Answer>> predictionAnswers = new HashMap <Prediction, Queue<Answer>>();
		predictionAnswers.put(prediction[0], answers0);
		predictionAnswers.put(prediction[1], answers0);
		predictionAnswers.put(prediction[2], answers0);
		
		Set<Entry<Prediction, Queue<Answer>>> entry = predictionAnswers.entrySet();
		System.out.println(predictionAnswers.entrySet());
		
//		Date date = new Date();
//		client1.showHistoryOfVisits(date, predictionResult);
		
		
//	int countOfClients = 0;
//	while (countOfClients <= 10) {
//		HashMap<Date, Client> client = vanga.
//		
	}
		
	}

//}
