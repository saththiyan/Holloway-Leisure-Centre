
public class Subscription {
    private String subscri_ID;
    private String price;
    private String description;

    public Subscription(String subscri_ID, String price2, String description) {
        this.subscri_ID = subscri_ID;
        this.price = price2;
        this.description = description;
    }

    public String getSubscri_ID() {
        return subscri_ID;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void add(Subscription subscriptions) {
    }
}

