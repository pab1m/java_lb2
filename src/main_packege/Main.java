package main_packege;
import car_package.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota Camry", 2019, 25000, 1234));
        cars.add(new Car(2, "Honda Civic", 2018, 20000, 4321));
        cars.add(new Car(3, "Ford Focus", 2020, 22000, 1478));
        cars.add(new Car(4, "Chevrolet Malibu", 2017, 18000, 8520));
        cars.add(new Car(5, "Toyota Camry", 2022, 30000, 6666));

//        List<Car> cars = setCar();

        CarsByModel(cars, "Toyota Camry");
        CarsByModelAndYears(cars, "Toyota Camry", 2);
        CarsByYearsAndPrice(cars, 2020, 20000);
    }

    public static void CarsByModel(List<Car> cars, String model) {
        System.out.println("Список автомобілів моделі " + model + ":");

        for (Car car: cars) {
            if (car.getModel().equals(model)) {
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public static void CarsByModelAndYears(List<Car> cars, String model, int year){
        System.out.println("Список автомобілів моделі " + model + ", які експлуатуються більше " + year + " років:");

        for (Car car: cars){
            if (car.getModel().equals(model) && (2023 - car.getYear()) > year){
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public static void CarsByYearsAndPrice(List<Car> cars, int year, int price){
        System.out.println("Список автомобілів " + year + "року випуску, ціна яких більше " +  price + ":");

        for (Car car: cars){
            if (car.getYear() == year && car.getPrice() > price){
                System.out.println(car);
            }
        }
        System.out.println();

    }

    private static List<Car> setCar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість авто: ");
        int N = scanner.nextInt();

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < N; i++) {
                System.out.println("Введіть характеристики авто " + (i + 1) + ": ");

                System.out.print("Введіть Id авто: ");
                int id = scanner.nextInt();

                System.out.print("Введіть модель авто: ");
                String model = scanner.next();

                System.out.print("Введіть рік випуску авто: ");
                int year = scanner.nextInt();

                System.out.print("Введіть ціну авто: ");
                int price = scanner.nextInt();

                System.out.print("Введіть реєстраційний номер авто: ");
                int registration_Num = scanner.nextInt();
                System.out.println();

                cars.add(new Car(id, model, year, price, registration_Num));
        }
        return cars;
    }
}