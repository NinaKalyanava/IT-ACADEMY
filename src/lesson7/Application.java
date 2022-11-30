package Lesson7;

public class Application {
    public static void main(String[] args) {
        House house = new House(5, 5, "Mike");
        System.out.println("house.length = " + house.length);
        System.out.println("house.width = " + house.width);
        System.out.println("house.name = " + house.name);

        house.stay();
        house.stay(354, "fgg");
        int width = house.stay(323, "dfdf");
        System.out.println("width = " + width);;
    }
}
