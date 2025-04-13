package Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment_4_CollectionsConcepts {

	public static void main(String[] args) {
		List<String> citiesNamesArrayList = new ArrayList<String>();
		citiesNamesArrayList.add("NEW YORK");
		citiesNamesArrayList.add("TOKYO");
		citiesNamesArrayList.add("CHICAGO");
		citiesNamesArrayList.add("MUMBAI");
		citiesNamesArrayList.add("NEW DELHI");
		List<String> citiesAreasArrayList = new ArrayList<String>();
		citiesAreasArrayList.add("12,093 SqKM");
		citiesAreasArrayList.add("10,086 SqKM");
		citiesAreasArrayList.add("9,265 SqKMM");
		citiesAreasArrayList.add("8,665 SqKM");
		citiesAreasArrayList.add("7,654");
		
//1. Create List with top 5 largest cities.Print total area of the 3rd and 4th cities combined		
		System.out.println("Name of 3rd city is :" +citiesNamesArrayList.get(2));
		System.out.println("Size of 3rd city is :" +citiesAreasArrayList.get(2));
		System.out.println("Name of 4th city is :" +citiesNamesArrayList.get(3));
		System.out.println("Size of 4th city is :" +citiesAreasArrayList.get(3));
//Converting the areas into integer numbers
		int areaCity3= 9265;
		int areaCity4 =8665;
		int TotalArea =areaCity3+areaCity4;
	System.out.println(TotalArea + " "+ "Sqkm");

//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
	List<String> mostvisitedPlacesArrayList = new ArrayList<String>();
	mostvisitedPlacesArrayList.add("Las Vegas Strip");
	mostvisitedPlacesArrayList.add("Louvre Museum");
	mostvisitedPlacesArrayList.add("Forbidden City");
	mostvisitedPlacesArrayList.add("Empire State Building");
	mostvisitedPlacesArrayList.add("Eiffel Tower");
	mostvisitedPlacesArrayList.add("Colosseum");
	mostvisitedPlacesArrayList.add("St. Peter's Basilica");
	mostvisitedPlacesArrayList.add("Taj Mahal");
	mostvisitedPlacesArrayList.add("Palace of Versailles");
	mostvisitedPlacesArrayList.add("Sagrada Família");
	List<String> mostVisitedPlaceSizes = new ArrayList<String>();
	mostVisitedPlaceSizes.add("720,000 sqkm");
	mostVisitedPlaceSizes.add("700,000 sqkm");
	mostVisitedPlaceSizes.add("650,000 sqkm");
	mostVisitedPlaceSizes.add("620,000 sqkm");
	mostVisitedPlaceSizes.add("450,000 sqkm");
	mostVisitedPlaceSizes.add("420,000 sqkm");
	mostVisitedPlaceSizes.add("360,000 sqkm");
	mostVisitedPlaceSizes.add("330,500 sqkm");
	mostVisitedPlaceSizes.add("310,000 sqkm");
	mostVisitedPlaceSizes.add("250,0000 sqkm");
	mostVisitedPlaceSizes.add("210,000 sqkm");
	mostVisitedPlaceSizes.add("180,0000 sqkm");
	System.out.println("Top 10 most visted places" + ": " + mostvisitedPlacesArrayList );
	System.out.println(mostVisitedPlaceSizes);
	
//3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.	
	int [] numbers = {4320,2130,5478,6765,3456,6578,1000,3002,2346,1999};
	double average = ((numbers[4]+ numbers[5])/2);
	System.out.println(average);
	
//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.	
	List<String> top5moviesLinkedList = new LinkedList<String>();
	top5moviesLinkedList.add("Bahubaali");
	top5moviesLinkedList.add("Dangal");
	top5moviesLinkedList.add("RRR");
	top5moviesLinkedList.add("Secret Superstar");
	top5moviesLinkedList.add("PK");
	
	System.out.println(top5moviesLinkedList.get(2));
	
	}
}
