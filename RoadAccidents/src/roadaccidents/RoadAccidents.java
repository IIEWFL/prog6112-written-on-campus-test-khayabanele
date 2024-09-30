package roadaccidents;

import java.util.*;

public class RoadAccidents {

    public static void main(String[] args) {
        // Array to store the vehicle types
        String vehicles[] = {"Cars", "Motor bike"};

        // Array to store the Cities
        String cities[] = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // Array to store the number of accidents
        int numCarAccidents[] = {155, 178, 112};
        int numMbAccidents[] = {121, 145, 89};

        int accidentDif[] = new int[numCarAccidents.length];
        for (int j = 0; j < numCarAccidents.length; j++) {
            accidentDif[j] = numCarAccidents[j] - numMbAccidents[j];
        }

        System.out.println("---------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("---------------------------------------------");
        System.out.println("City           Car   Motor Bike");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s R%-5d R%-5d%n", cities[i], numCarAccidents[i], numMbAccidents[i]);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Road ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");

        int maxDif = accidentDif[0];
        int maxPoint = 0;

        for (int i = 1; i < accidentDif.length; i++) {
            if (accidentDif[i] > maxDif) {
                maxDif = accidentDif[i];
                maxPoint = i;
            }
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s R%d%n", cities[i], accidentDif[i]);
        }

        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[maxPoint]);
        System.out.println("-------------------------------------------------");
    }
}
