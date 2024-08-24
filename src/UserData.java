import java.io.Serializable;
import java.util.List;

public class UserData implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private List<Income> incomes;
    private List<Expense> expenses;

    public UserData() {
        // Default constructor
    }

    public UserData(List<Income> incomes, List<Expense> expenses) {
        this.incomes = incomes;
        this.expenses = expenses;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
