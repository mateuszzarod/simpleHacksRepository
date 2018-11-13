package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class User implements PowerManager {
    private String name;
    private String surname;
    private int id;
    private List<Power> listOfPowers;

    public User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        listOfPowers = new ArrayList<>();
        listOfPowers.add(Power.CAN_WRITE);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public List<Power> getListOfPowers() {
        return listOfPowers;
    }

    @Override
    public void addPower(Power power) {
        listOfPowers.add(power);
    }

    @Override
    public void removePower(Power power) {
        listOfPowers.remove(power);
    }

    public static List<Power> checkPowers(User user) {
        return user.getListOfPowers();
    }
}
