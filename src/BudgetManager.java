public class BudgetManager {
    private double budget;

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean isWithinBudget(double expenses) {
        return expenses <= budget;
    }
}
