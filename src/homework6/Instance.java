package homework7;

public class Instance {
    public static void main(String[] args) {
        Phone phone = new Phone(1, 6, 200);
        System.out.println("Phone number is: " + phone.number + ". Phone model is: " + phone.model + ". Phone weight is: " + phone.weight + ".");

        Phone phone2 = new Phone(2, 7, 150);
        System.out.println("Phone number is: " + phone2.number + ". Phone model is: " + phone2.model + ". Phone weight is: " + phone2.weight + ".");

        Phone phone3 = new Phone(3, 8, 100);
        System.out.println("Phone number is: " + phone3.number + ". Phone model is: " + phone3.model + ". Phone weight is: " + phone3.weight + ".");
        System.out.println();

        phone.receiveCall("Maria");
        phone.getNumber(5646526322l);

        phone2.receiveCall("Nik");
        phone2.getNumber(454121);

        phone3.receiveCall("Pol");
        phone3.getNumber(1234567);
        System.out.println();

        phone.receiveCall("Nik", 123456);
        phone2.receiveCall("Olga", 321654);
        phone3.receiveCall("Men", 55555);
        System.out.println();

        phone.sendMessage(356535, 4546565, 54656565, 56565656, 5656565, 56565, 212, 121521);
    }
}
