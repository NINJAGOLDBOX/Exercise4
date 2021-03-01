package com.company.Slye;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> cityTemp = new HashMap<>();
        ArrayList<String> userCities = new ArrayList<>();
	    String userCity = promptCity();
        double userTemp;
	    while(!userCity.equals("END")){
	        userCities.add(userCity);
	        userCity = promptCity();
        }
	    for(int i = 0; i < userCities.size(); i++){
	        userCity = userCities.get(i);
            ArrayList<Double> temps = new ArrayList<>();
            System.out.println("Temperatures for " + userCities.get(i));
            promptTemp(temps);
            userTemp = averageTemp(temps);
	        cityTemp.put(userCity, userTemp);
        }
	    displayResults(cityTemp);
    }

    static String promptCity(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the city? ");
        return input.nextLine();
    }
    static void promptTemp(ArrayList<Double> temps){
        for(int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the temperature of the " + (i+1) + " day");
            Double userTemp = input.nextDouble();
            temps.add(userTemp);
        }
    }
    static double averageTemp(ArrayList<Double> temps){
        double addAll = temps.get(0) + temps.get(1) + temps.get(2) + temps.get(3) + temps.get(4);
        return addAll/5;
    }
    static void displayResults(HashMap<String, Double> cityTemp){
        System.out.println(cityTemp);
    }
}
