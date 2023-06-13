import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terminal {

    private String terminalNumber;
    private List<String> services;
    private Booking booking;
    private int id;

    public Terminal(String terminalNumber, Booking booking) {
        this.terminalNumber = terminalNumber;
        this.services = new ArrayList<>();
        this.booking = booking;
    }

    public void addServices(){
        services.add("Міні маркет" +  " Кафе" + " Кав'ярня");
    }

    public String showNum(){
        return "Термінал №" + terminalNumber;
    }

    public void checkBooking(){
        booking.addId();
        System.out.println("Вас вітає " + showNum());
        System.out.println("Введіть id вашого бронювання");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        if (id == booking.getBookId().get(0)){
            System.out.println("Ваше id співпадає, проходьте у літак");
        } else {
            System.out.println("id не співпадає");
        }
    }

    public void showServices(){
        addServices();
        System.out.println("Перелік послуг терміналу");
        for (String s: services) {
            System.out.println(s);
        }
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
