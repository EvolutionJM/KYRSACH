import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baggage {

    private String weight;
    private String type;
    private String size;
    private String contents;
    private String destination;
    private List<String> baggage;

    public Baggage(){
        this.baggage = new ArrayList<>();
    }

    public void addBag(){
        baggage.add(weight + " " + type + " " + size + " " + contents);
    }

    public void enterBaggage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вагу вашого багажу");
        weight = scanner.nextLine();
        System.out.println("Введіть тип багажу");
        type = scanner.nextLine();
        System.out.println("Введіть розмір багажу");
        size = scanner.nextLine();
        System.out.println("Введіть вміст багажу");
        contents = scanner.nextLine();
        System.out.println("Введіть місце призначення багажу");
        destination = scanner.nextLine();
        addBag();
        System.out.println("Ваш багаж: ");
        for (String s: baggage){
            System.out.println("- " + s + ".");
        }
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getBaggage() {
        return baggage;
    }

    public void setBaggage(List<String> baggage) {
        this.baggage = baggage;
    }
}
