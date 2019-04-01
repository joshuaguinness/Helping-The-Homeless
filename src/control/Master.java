package control;

import java.util.ArrayList;

import algsstructs.*;
import adt.CoolingCentreT;
import adt.ShelterT;
import adt.UserT;
import adt.ShelterT.shelterResT;
import adt.UserT.UserResT;
import io.Read;
import process.Weight;

// Control module which will control all of our functionality
public class Master {
	
	public static void main(String args[]) {		
		System.out.println("Start");
		ShelterT[][] masterArray = Read.readShelterData();
		System.out.println("Done");
		//System.out.println(masterArray[1][7].getAddress());
		
		//System.out.println(Weight.calcScore(masterArray[0][4], new UserT(UserResT.MALE_ONLY, 43.239487, -73.109472)));
		
			
		
		// Prints all program names, scores, and total number of shelters
//		int counter = 0;
//		
		
		UserT user = new UserT(UserResT.MALE_ONLY, 43.239487, -73.109472);
		
		for (int i = 0; i < masterArray.length; i++) {
			for (int j = 0; j < masterArray[i].length; j++) {
				System.out.println(i + " " + j + " "  + masterArray[i][j].getProgName());
				System.out.println("   " + Weight.calcScoreShel(masterArray[i][j], user));
				masterArray[i][j].setScore(Weight.calcScoreShel(masterArray[i][j], user));
//				counter ++;
			}
		}
		
		MaxPQ<ShelterT> pq = new MaxPQ<ShelterT>(masterArray[1]);
//		
//		System.out.println(counter);
		
		CoolingCentreT[] cool = Read.readCoolingData();
		
	}

}
