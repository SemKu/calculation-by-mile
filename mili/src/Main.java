public class Main {
    public static void main(String[] args) {
        long ticketPrice = 8_000;
        long amountRub = 20;
        long bonusMillies = ticketPrice / amountRub;
        System.out.println(bonusMillies);
    }
}
