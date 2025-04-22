package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArrayandCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question1 
		//
		List<String> cities=new ArrayList<String>();
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Hydrabed");
		
		System.out.println("Print 3rd and 4th Cities combined: "+cities.get(2) + cities.get(3));
		System.out.println(cities.size());
		
		
		//Question2
		
		Set<String> tourist=new HashSet<String>();
		tourist.add("Kodai");
		tourist.add("OOty");
		tourist.add("Valparai");
		tourist.add("Dhanushkodi");
		tourist.add("Varkala");
		tourist.add("Theni");
		tourist.add("Munnar");
		tourist.add("Chikmangal");
		tourist.add("GOA");
		tourist.add("Thaiand"); 
		
		System.out.println(tourist.size()); 
		System.out.println("Most visited Tourist place:"+tourist);

		
		//Question3
		int[] randomnum=new int[10];
		randomnum[0]=25;
		randomnum[1]=199;
		randomnum[2]=98;
		randomnum[3]=77;
		randomnum[4]=95;
		randomnum[5]=72;
		randomnum[6]=222;
		randomnum[7]=251;
		randomnum[8]=205;
		randomnum[9]=75; 
		
		float avg=((randomnum[4]+randomnum[5])/2f);
		System.out.println("Avg of 5th and 6th value: "+avg); 
		
		
		//Question4 
		
		List<String> grossing=new ArrayList<String>();
		grossing.add("KGF");
		grossing.add("Jailer");
		grossing.add("Leo");
		grossing.add("RRR");
		grossing.add("Sachin"); 
		
		System.out.println("Third movie o this List: "+grossing.get(2)); 
		

	}

}
