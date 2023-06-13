import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String date;
    private String status;
    private List<String> flights;

    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime, String gate, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.date = gate;
        this.status = status;
        this.flights = new ArrayList<>();
    }

    public void addFlights(){
        flights.add(flightNumber + " " + origin + " " + destination);
    }

    @Override
    public String toString() {
        return "Номер рейсу " + flightNumber + "\n" +
                "Місце відправлення " + origin + "\n" +
                "Місце прибуття " + destination + "\n" +
                "Час відправлення " + departureTime + "\n" +
                "Час прибуття " + arrivalTime + "\n" +
                "Дата прибуття " + date + "\n" +
                "Статус рейсу " + status + "\n";
    }

    public void showFlights(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Переглянути заплановий рейс? +/-");
        String s = scanner.nextLine();
        if (s.equals("+")){
            System.out.println(toString());
        } else if (s.equals("-")) {
            System.out.println("Виберіть інші опції");
        } else {
            System.out.println("Введено щось не коректне");
        }

    }

    public void search(){
        addFlights();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Знайти потрібний рейс? +/-");
        String s = scanner.nextLine();
        if (s.equals("+")){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введіть номер рейсу");
            String num = scanner1.nextLine();
            System.out.println("Введіть місце відправлення");
            String orig = scanner1.nextLine();
            System.out.println("Введіть місце прибуття");
            String dest = scanner1.nextLine();
            if (flights.contains(num + " " + orig + " " + dest)){
                System.out.println("Потрібний рейс знайдено");
                System.out.println(num + " " + orig + " " + dest);
            } else {
                System.out.println("Такого рейсу не існує");
            }
        }else if (s.equals("-")) {
            System.out.println("Виберіть інші опції");
        } else {
            System.out.println("Введено щось не коректне");
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getFlights() {
        return flights;
    }

    public void setFlights(List<String> flights) {
        this.flights = flights;
    }
}
