package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_LoopForHikeCalc {

	public static void main(String[] args) {
   
		List<String> Names=new ArrayList<String>();
		Names.add("Alice Johnson");
		Names.add("Bob Smith");
		Names.add("Carol Davis");
		Names.add("David Brown");
		Names.add("Eva Green"); 
		
		List<Double> salary=new ArrayList<Double>();
		salary.add(75000.0);
		salary.add(68000.0);
		salary.add(82000.0);
		salary.add(90000.0);
		salary.add(60000.0); 
		
		List<Double> Experience=new ArrayList<Double>();
		Experience.add(5.1);
		Experience.add(3.2);
		Experience.add(7.1);
		Experience.add(10.2);
		Experience.add(2.4); 
		
		List<Double> Rating=new ArrayList<Double>();
		Rating.add(4.2);
		Rating.add(3.8);
		Rating.add(4.5);
		Rating.add(2.0);
		Rating.add(3.5);   
		
		 Map<String, Double> hikeMap = new HashMap<>();
		
		 for (int i = 0; i < Names.size(); i++) {
			 double baseSalary =salary.get(i);
	            double exp =Experience.get(i);
	            double rate =Rating.get(i);

	            double variablePayPercentage=0;
	            double bonus=0;
	            double reward = 0;
	           
	            if(rate>=4) {
	            	variablePayPercentage=15.0;
	            	bonus=1500;	            	       	
	            }else if(rate>=3 && rate<4) {
	            	variablePayPercentage=10.0;
	            	bonus=1200;
	            }else{
	            	variablePayPercentage=3.0;
	            	bonus=300; 
	            } if(exp >= 5) {
	            	reward=5000;
	            }
	            
	            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
	            double hikePercentage = (hike / baseSalary) * 100; 
	            hikeMap.put(Names.get(i), hikePercentage);
		}
		
		System.out.println(hikeMap);
		
	}

}
