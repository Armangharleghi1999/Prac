/*
Design a parking lot using object-oriented principles

Goals:
- Your solution should be in Java - if you would like to use another language, please let the interviewer know.
- Boilerplate is provided. Feel free to change the code as you see fit

Assumptions:
- The parking lot can hold motorcycles, cars and vans
- The parking lot has motorcycle spots, car spots and large spots
- A motorcycle can park in any spot
- A car can park in a single compact spot, or a regular spot
- A van can park, but it will take up 3 regular spots
- These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed

Here are a few methods that you should be able to run:
- Tell us how many spots are remaining
- Tell us how many total spots are in the parking lot
- Tell us when the parking lot is full
- Tell us when the parking lot is empty
- Tell us when certain spots are full e.g. when all motorcycle spots are taken
- Tell us how many spots vans are taking up

Hey candidate! Welcome to your interview. I'll start off by giving you a Solution class. To run the code at any time, please hit the run button located in the top left corner.
*/

import java.util.*;
public class ParkingLot {

    public static void main(String[] args) {
        UI ui = new UI();
        final Scanner in = new Scanner(System.in);
        loop: do {
            switch (ui.printMenuAndGetSelection()) {
                case 1 -> {
                    System.out.println("What vehicle would you like to park? (motorcycle/car/van)");
                    ui.Park(in.nextLine());
                    System.out.println("_______________________________________________________________\n");
                }
                case 2 -> {
                    System.out.println("This parking lot has " + ui.getTotal_spots() + " total spots.");
                    System.out.println("_______________________________________________________________\n");
                }
                case 3 -> {
                    System.out.println("We have " + ui.getTotal_spots_left() + " spots available.");
                    System.out.println("_______________________________________________________________\n");
                }
                case 4 -> {
                    System.out.println("There are :");
                    System.out.println(ui.getMotorcycle_count() + ui.getMotorcycle_in_regular_count() + ui.getMotorcycle_in_large_count() + " motorcycles,");
                    System.out.println(ui.getCars_count() + " cars,");
                    System.out.println(ui.getVans_count() + ui.getVans_in_regular_count() + " vans currently parked in the parking lot.");
                    System.out.println("_______________________________________________________________\n");
                }
                case 5 -> {
                    System.out.println("What type of vehicle would you like to remove? (motorcycle/car/van)");
                    ui.remove_Car(in.nextLine());
                    System.out.println("_______________________________________________________________\n");
                }
                case 6 -> {
                    System.out.println("Thank you for visiting! Hope to see you again soon.");
                    System.out.println("_______________________________________________________________\n");
                    break loop;
                }
            }
        }while(true);
    }
}