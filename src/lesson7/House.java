package lesson7;

public class House {
    int length;
    int width;
    String name;


    House(int length, int width, String name) {
        //инициализация переменных кот объявили выше   конструктор
        this.length = length;
        this.width = width;
        this.name = name;
    }

    void stay() {
        System.out.println("Stay void ");

    }

    int stay(int length, String newName) {
        this.length = length;
        name = newName;
        System.out.println(this.length + " " + name);
        return width;
    }
}
