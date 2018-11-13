package HomeWork;

import java.util.List;

public class Admin extends User {



    public Admin(String name, String surname, int id) {
        super(name, surname, id);
        super.addPower(Power.CAN_OBSERVE);
        super.addPower(Power.CAN_EDIT);
    }

    public static List<Power> checkPowers(User user){
        return user.getListOfPowers();
    }


}


