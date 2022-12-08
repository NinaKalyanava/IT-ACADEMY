package homework10;

import java.util.*;

public class HomeWork10Task3 {
    public static void main(String[] args) {
        User user1 = new User("John", "Smith");
        User user2 = new User("John", "Smith");
        User user3 = new User("Adam", "Vector");

        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        System.out.println("set " + set);

        Set<User> set2 = new TreeSet<>();
        set2.add(user1);
        set2.add(user2);
        set2.add(user3);
        System.out.println("set2 " + set2);
    }
}

class User implements Comparable<User> {

    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        } else if (objectToCompare instanceof User) {
            User userToCompare = (User) objectToCompare;
            String firstNameToCompare = userToCompare.firstName;
            return this.firstName != null
                    ? this.firstName.equals(firstNameToCompare) && this.lastName == userToCompare.lastName
                    : firstNameToCompare == null;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    @Override
    public String toString() {
        return "{firstName = " + firstName + ", lastName = " + lastName + '}';
    }

    @Override
    public int compareTo(final User userToCompare) {
        if (this.firstName == userToCompare.firstName) {
            return 0;
        } else if (this.lastName.hashCode() > userToCompare.lastName.hashCode()) {
            return 1;
        }
        return -1;
    }
}

