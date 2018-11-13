package HomeWork;

public class Main {
    public static void main(String[] args) {
        User user = new User("mati", "zaród", 123);
        User user2 = new Admin("mati", "zaród", 123);
        user2.addPower(Power.CAN_WHATEVER);
        System.out.println(User.checkPowers(user2));
        user2.removePower(Power.CAN_OBSERVE);
        System.out.println(User.checkPowers(user2));
    }
}
