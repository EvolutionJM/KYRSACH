import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Booking extends Passenger{

    private int bookingId;
    private int seatNumber;
    private String upOrigin;
    private String upDestination;

    private List<Integer> bookId;

    public Booking(String flightNumber, String origin, String destination, String departureTime, String arrivalTime, String gate, String status) {
        super(flightNumber, origin, destination, departureTime, arrivalTime, gate, status);
        this.bookId = new ArrayList<>();
    }

    public void getIdSeat(){
        Random random = new Random();
        seatNumber = random.nextInt(100) + 1;
        bookingId = random.nextInt(1000);
        System.out.println("Номер місця " + seatNumber);
        System.out.println("ID бронювання " + bookingId);
        bookId.add(bookingId);
    }
    public void addId(){
        Random random = new Random();
        bookingId = random.nextInt(1000);
        System.out.println("ID бронювання " + bookingId);
        bookId.add(bookingId);
    }

    public void book(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Забронювати квиток? +/-");
        String s = scanner.nextLine();
        if (s.equals("+")) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введіть місце відправлення");
            upOrigin = scanner1.nextLine();
            System.out.println("Введіть місце прибуття");
            upDestination = scanner1.nextLine();
            if(upOrigin.equals(getOrigin()) && upDestination.equals(getDestination())){
                enterYourData();
                getIdSeat();
            } else {
                System.out.println("Такого рейсу не існує");
            }
        } else if (s.equals("-")) {
            System.out.println("Виберіть інші опції");
        } else {
            System.out.println("Введено щось не коректне");
        }

    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getUpOrigin() {
        return upOrigin;
    }

    public void setUpOrigin(String upOrigin) {
        this.upOrigin = upOrigin;
    }

    public String getUpDestination() {
        return upDestination;
    }

    public void setUpDestination(String upDestination) {
        this.upDestination = upDestination;
    }

    public List<Integer> getBookId() {
        return bookId;
    }

    public void setBookId(List<Integer> bookId) {
        this.bookId = bookId;
    }
}
