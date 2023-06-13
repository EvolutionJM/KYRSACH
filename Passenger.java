import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passenger extends Flight{

    private String firstName; // Ім'я пасажира
    private String lastName; // Прізвище пасажира
    private String passportNumber; // Номер паспорту пасажира
    private String age; // Вік пасажира

    private List<String> passengers;

    public Passenger(String flightNumber, String origin, String destination, String departureTime, String arrivalTime, String gate, String status) {
        super(flightNumber, origin, destination, departureTime, arrivalTime, gate, status);
        this.passengers = new ArrayList<>();
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void addPassengers(){
        passengers.add(firstName + " " + lastName + " " + age + " " + passportNumber);
    }

    public void enterYourData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свої дані");
        System.out.println("Введіть ім'я");
        firstName = scanner.nextLine();
        System.out.println("Введіть прізвище");
        lastName = scanner.nextLine();
        System.out.println("Введіть свій вік");
        age = scanner.nextLine();
        System.out.println("Введіть номер паспорту");
        passportNumber = scanner.nextLine();

        System.out.println("Ваші дані:");
        System.out.println("ПІБ: " + getFullName());
        System.out.println("Вік " + age);
        System.out.println("Номер паспорту " + passportNumber);
        addPassengers();


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }
}
