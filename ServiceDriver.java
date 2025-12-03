import java.util.Scanner;

interface Servicing {
    int getServiceTime();
}

class Car implements Servicing {
    private int serviceTime;

    Car(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }
}

class Bike implements Servicing {
    private int serviceTime;

    Bike(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }
}

public class ServiceDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car service time: ");
        int carTime = sc.nextInt();

        System.out.print("Enter Bike service time: ");
        int bikeTime = sc.nextInt();

        Servicing carService = new Car(carTime);
        Servicing bikeService = new Bike(bikeTime);

        System.out.println("Car service time: " + carService.getServiceTime() + " minutes");
        System.out.println("Bike service time: " + bikeService.getServiceTime() + " minutes");

        sc.close();
    }
}
