import java.util.Scanner;

public class UI{
    final Scanner in = new Scanner(System.in);

    private final int large_Spots = 15;
    private final int regulars_Spots = 20;
    private final int compacts_Spots = 30;
    private int larges_Left = large_Spots;
    private int regulars_Left = regulars_Spots;
    private int compacts_Left = compacts_Spots;
    private int motorcycle_count = 0;
    private int motorcycle_in_regular_count = 0;
    private int motorcycle_in_large_count = 0;
    private int cars_count = 0;
    private int vans_count = 0;
    private int vans_in_regular_count = 0;



    public int getLarges_Left() {
        return larges_Left;
    }

    public void setLarges_Left(int larges_Left) {
        this.larges_Left = larges_Left;
    }

    public int getRegulars_Left() {
        return regulars_Left;
    }

    public void setRegulars_Left(int regulars_Left) {
        this.regulars_Left = regulars_Left;
    }

    public int getCompacts_Left() {
        return compacts_Left;
    }

    public void setCompacts_Left(int compacts_Left) {
        this.compacts_Left = compacts_Left;
    }

    public int getVans_in_regular_count() {
        return vans_in_regular_count;
    }

    public void setVans_in_regular_count(int vans_in_regular_count) {
        this.vans_in_regular_count = vans_in_regular_count;
    }

    public int getMotorcycle_in_regular_count() {
        return motorcycle_in_regular_count;
    }

    public void setMotorcycle_in_regular_count(int motorcycle_in_regular_count) {
        this.motorcycle_in_regular_count = motorcycle_in_regular_count;
    }

    public int getMotorcycle_in_large_count() {
        return motorcycle_in_large_count;
    }

    public void setMotorcycle_in_large_count(int motorcycle_in_large_count) {
        this.motorcycle_in_large_count = motorcycle_in_large_count;
    }

    public int getMotorcycle_count() {
        return motorcycle_count;
    }

    public void setMotorcycle_count(int motorcycle_count) {
        this.motorcycle_count = motorcycle_count;
    }

    public int getCars_count() {
        return cars_count;
    }

    public void setCars_count(int cars_count) {
        this.cars_count = cars_count;
    }

    public int getVans_count() {
        return vans_count;
    }

    public void setVans_count(int vans_count) {
        this.vans_count = vans_count;
    }

    public int getTotal_spots() {
        return large_Spots+regulars_Spots+compacts_Spots;
    }

    public int getTotal_spots_left() {
        return larges_Left+regulars_Left+compacts_Left;
    }

    public boolean isFull(int s){
        return s==0;
    }

    public void Park(String Vehicle){
        if (Vehicle.equalsIgnoreCase("motorcycle")){
            if (!isFull(getCompacts_Left())){
                setCompacts_Left(getCompacts_Left()-1);
                setMotorcycle_count(getMotorcycle_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
            else if(!isFull(getRegulars_Left())){
                setRegulars_Left(getRegulars_Left()-1);
                setMotorcycle_in_regular_count(getMotorcycle_in_regular_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
            else if(!isFull(getLarges_Left())){
                setLarges_Left(getLarges_Left()-1);
                setMotorcycle_in_large_count(getMotorcycle_in_large_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
        }
        if (Vehicle.equalsIgnoreCase("car")){
            if (!isFull(getRegulars_Left())){
                setCompacts_Left(getCompacts_Left()-1);
                setCars_count(getCars_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
        }
        if (Vehicle.equalsIgnoreCase("van")){
            if (!isFull(getLarges_Left())&&getLarges_Left()>2){
                setLarges_Left(getLarges_Left()-3);
                setVans_count(getVans_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
            else if(getCompacts_Left()>2){
                setCompacts_Left(getCompacts_Left()-3);
                setVans_in_regular_count(getVans_in_regular_count()+1);
                System.out.println(Vehicle+" successfully parked.");
            }
        }
    }

    public void remove_Car(String Vehicle){
        if (Vehicle.equalsIgnoreCase("motorcycle")) {
            if (getMotorcycle_in_large_count() > 0) {
                setMotorcycle_in_large_count(getMotorcycle_in_large_count() - 1);
                setLarges_Left(getLarges_Left() - 1);
                System.out.println(Vehicle + " successfully removed");
            } else if (getMotorcycle_in_regular_count() > 0) {
                setMotorcycle_in_regular_count(getMotorcycle_in_regular_count() - 1);
                setRegulars_Left(getRegulars_Left() + 1);
                System.out.println(Vehicle + " successfully removed");
            } else if (getMotorcycle_count() > 0) {
                setMotorcycle_count(getMotorcycle_count() - 1);
                setCompacts_Left(getCompacts_Left() + 1);
                System.out.println(Vehicle + " successfully removed");
            } else {
                System.out.println("No " + Vehicle + " found.");
            }
        }
        if (Vehicle.equalsIgnoreCase("car")) {
            if (getCars_count() > 0) {
                setCars_count(getCars_count() - 1);
                setRegulars_Left(getRegulars_Left() + 1);
                System.out.println(Vehicle + " successfully removed");
                }
            else {
                System.out.println("No " + Vehicle + " found.");
                }
            }
            if (Vehicle.equalsIgnoreCase("van")) {
                if (getVans_in_regular_count() > 0) {
                    setVans_count(getVans_count() - 1);
                    setRegulars_Left(getRegulars_Left() + 3);
                    System.out.println(Vehicle + " successfully removed");
                    }
                }
            else if (getVans_count() > 0) {
                    setVans_count(getVans_count() - 1);
                    setLarges_Left(getLarges_Left() + 3);
                    System.out.println(Vehicle + " successfully removed");
                }
            else {
                    System.out.println("No " + Vehicle + " found.");
                }
            }

            public int printMenuAndGetSelection () {
                System.out.println("Welcome to the parking Lot.");
                System.out.println("Main Menu");
                System.out.println("1. Park my vehicle.");
                System.out.println("2. Show total number of spots.");
                System.out.println("3. Show available spots.");
                System.out.println("4. Show how many of each vehicle is in the parking lot.");
                System.out.println("5. Remove a car");
                System.out.println("6. Exit!");
                System.out.println(("Please select from the above choices. 1-6"));
                return Integer.parseInt(in.nextLine());
            }
}