import java.util.Scanner;

public class Airport {

    static Flight flight = new Flight("123", "Львів", "Варшава", "11:30", "14:00", "01.06.23", "Заплановано");
    static Passenger passenger = new Passenger("123", "Львів", "Варшава", "11:30", "14:00", "01.06.23", "Заплановано");
    static Booking booking = new Booking("123", "Львів", "Варшава", "11:30", "14:00", "01.06.23", "Заплановано");
    static Baggage baggage = new Baggage();
    static Terminal terminal = new Terminal("1", new Booking("123", "Львів", "Варшава", "11:30", "14:00", "01.06.23", "Заплановано"));

    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вибирайте:");
        System.out.println("- перевірити id бронювання");
        System.out.println("- показати послуги терміналу");
        System.out.println("- переглянути заплановий рейс");
        System.out.println("- знайти потрібний рейс");
        System.out.println("- забронювати квиток");
        System.out.println("- описати багаж");
        String choose = scanner.nextLine();
        if (choose.equalsIgnoreCase("перевірити id бронювання")){
            terminal.checkBooking();
        } else if (choose.equalsIgnoreCase("показати послуги терміналу")) {
            terminal.showServices();
        } else if (choose.equalsIgnoreCase("переглянути заплановий рейс")) {
            flight.showFlights();
        } else if (choose.equalsIgnoreCase("знайти потрібний рейс")) {
            flight.search();
        } else if (choose.equalsIgnoreCase("забронювати квиток")) {
            booking.book();
        } else if (choose.equalsIgnoreCase("описати багаж")) {
            baggage.enterBaggage();
        } else {
            System.out.println("Введено щось не коректне");
        }
    }

    public static void main(String[] args) {
        while (true){
            mainMenu();
            System.out.println("*******************************************");
        }
    }
}