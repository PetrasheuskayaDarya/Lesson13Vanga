package by.htp.future.entity;


public class Prediction {
		
		private String nameOfPrediction;

		public Prediction() {
			super();
		}

		public Prediction(String nameOfPrediction) {
			super();
			this.nameOfPrediction = nameOfPrediction;
		}

		public String getNameOfPrediction() {
			return nameOfPrediction;
		}

		public void setNameOfPrediction(String nameOfPrediction) {
			this.nameOfPrediction = nameOfPrediction;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nameOfPrediction == null) ? 0 : nameOfPrediction.hashCode());
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
			Prediction other = (Prediction) obj;
			if (nameOfPrediction == null) {
				if (other.nameOfPrediction != null)
					return false;
			} else if (!nameOfPrediction.equals(other.nameOfPrediction))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Prediction [nameOfPrediction=" + nameOfPrediction + "]";
		}
		
		
		
//	  LinkedHashMap<Integer,String> prediction = new LinkedHashMap<Integer,String>();  
//	    
//	    prediction.put(1,"Love");  
//	    prediction.put(2,"luck");  
//	    prediction.put(3,"family"); 
//	   
//	    
//	    for(Map.Entry m:prediction.entrySet()){  
//	     System.out.println(m.getKey()+" "+m.getValue());  
//	   }  
		
	 }
	
