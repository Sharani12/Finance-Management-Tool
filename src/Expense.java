import java.io.Serializable;

public class Expense implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private final String description;
    private final double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

