package ooplab7;

import java.util.Scanner;

public class mySuperCar {

    public static void main(String[] args) {
        SuperCar c2 = new SuperCar();
        c2 = inputData(c2);
    }

    private static SuperCar inputData(SuperCar c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Super Car info: ");
        System.out.print("Super Car Brand: ");
        c.setCarBrand(scanner.nextLine());
        System.out.print("Car Color: ");
        c.setCarColor(scanner.nextLine());
        System.out.print("Engine size: ");
        c.setCarEngineSize(scanner.nextLine());
        System.out.print("Max speed : ");
        c.setMaxSpeed(scanner.nextLine());
        System.out.print("Country of origin: ");
        c.setContryofOrigin(scanner.nextLine());
        System.out.print("Super Car Class: ");
        c.setSuperCarClass(scanner.nextLine());

        return c;
    }

}
