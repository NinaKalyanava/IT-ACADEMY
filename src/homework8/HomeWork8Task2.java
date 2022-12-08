package homework8;

public class HomeWork8Task2 {
    public static void main(String[] args) {
        final Flower rose1 = new Rose(10, "white", 7);
        final Flower rose2 = new Rose(19, "red", 8);
        final Flower tulip = new Tulip(8, "blue", 6);
        final Flower carnation = new Carnation(20, "black", 10);
        final Flower lily = new Lily(10.5, "yellow", 12);

        Bouquet bouquet = new Bouquet(3);
        final boolean isAddedFlower1 = bouquet.addFlower(rose1);
        final boolean isAddedFlower2 = bouquet.addFlower(tulip);
        final boolean isAddedFlower3 = bouquet.addFlower(lily);
        final boolean isAddedFlower4 = bouquet.addFlower(carnation);
        final boolean isAddedFlower5 = bouquet.addFlower(rose2);

        System.out.println("Bouquet prise is " + bouquet.bouquetPrice());
        System.out.println("The bouquet uses such colors: " + bouquet.bouquetColors());
        System.out.println("The bouquet will wither in " + bouquet.bouquetLifespan() + " days.");
    }
}

class Flower {

    private String name;
    private double price;
    private String color;
    private int lifespan;

    Flower(String name, double price, String color, int lifespan) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
}

class Rose extends Flower {
    public Rose(double price, String color, int lifespan) {
        super("Rose", price, color, lifespan);
    }
}

class Carnation extends Flower {
    public Carnation(double price, String color, int lifespan) {
        super("Carnation", price, color, lifespan);
    }
}

class Tulip extends Flower {
    public Tulip(double price, String color, int lifespan) {
        super("Tulip", price, color, lifespan);
    }
}

class Lily extends Flower {
    public Lily(double price, String color, int lifespan) {
        super("Lily", price, color, lifespan);
    }
}

class Chamomile extends Flower {
    public Chamomile(double price, String color, int lifespan) {
        super("Chamomile", price, color, lifespan);
    }
}

class Bouquet {

    private final Flower[] flowers;

    private int currentElement;
    double price = 0;
    String colors = "";
    int lifespan = 0;

    public Bouquet(final int numberOfFlowers) {
        this.flowers = new Flower[numberOfFlowers];
        this.currentElement = 0;
    }

    public boolean addFlower(final Flower flower) {
        if (currentElement == flowers.length) {
            return false;
        }
        flowers[currentElement] = flower;
        currentElement++;
        return true;
    }


    public double bouquetPrice() {
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getPrice();
        }
        return price;
    }


    public String bouquetColors() {
        for (int y = 0; y < flowers.length; y++) {
            colors += flowers[y].getColor() + "\s";
        }
        return colors;
    }


    public int bouquetLifespan() {
        for (int j = 0; j < flowers.length; j++) {
            if (flowers[j].getLifespan() > lifespan) {
                lifespan = flowers[j].getLifespan();
            }
        }
        return lifespan;
    }

}
