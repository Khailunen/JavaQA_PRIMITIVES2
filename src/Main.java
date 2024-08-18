public class Main {
    public static void main(String[] args) {

        int balance = 317;
        int payment = 1505;

        int bonus;
        if (payment >= 1000) {
            bonus = payment/100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш текущий баланс: " + (bonus + payment + balance));
    }
}