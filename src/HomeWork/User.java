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
        listOfPowers.add(Power.CAN_WHATEVER);
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

    public int getPowersSize() {
        return listOfPowers.size();
    }

    public List<Power> getListOfPowers() {
        return listOfPowers;
    }

    @Override
    public void addPower(Power power) {
        listOfPowers.add(power);
    }

    @Override
    public boolean removePower(Power power) {
        boolean result = false;
        if (listOfPowers.contains(power)) {
            listOfPowers.remove(power);
            result = true;
        }
        return result;
    }

    public static List<Power> checkPowers(User user) {
        return user.getListOfPowers();

    }
}
