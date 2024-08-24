import java.util.List;

public class FinanceManager {
    private final List<Income> incomes;
    private final List<Expense> expenses;

    public FinanceManager(List<Income> incomes, List<Expense> expenses) {
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
