
public class Event {

    private String name;
    private String date;
    private double price;
    private String description;

    public Event(String name, String date, double price, String description) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
