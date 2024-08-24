import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Convert to try-with-resources
            FinanceManager financeManager = new FinanceManager(
                new ArrayList<>(), // Initial empty list of incomes
                new ArrayList<>()  // Initial empty list of expenses
            );

            while (true) {
                System.out.println("Welcome to the Personal Finance Manager!");
                System.out.println("1. Add Income");
                System.out.println("2. Add Expense");
                System.out.println("3. View Summary");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (option) {
                    case 1:
                        System.out.print("Enter income description: ");
                        String incomeDescription = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double incomeAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline
                        financeManager.getIncomes().add(new Income(incomeDescription, incomeAmount));
                        System.out.println("Income added.");
                        break;
                    case 2:
                        System.out.print("Enter expense description: ");
                        String expenseDescription = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double expenseAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline
                        financeManager.getExpenses().add(new Expense(expenseDescription, expenseAmount));
                        System.out.println("Expense added.");
                        break;
                    case 3:
                        double totalIncome = financeManager.getIncomes().stream()
                            .mapToDouble(Income::getAmount)
                            .sum();
                        double totalExpenses = financeManager.getExpenses().stream()
                            .mapToDouble(Expense::getAmount)
                            .sum();
                        System.out.printf("Total Income: $%.2f%n", totalIncome);
                        System.out.printf("Total Expenses: $%.2f%n", totalExpenses);
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } // Scanner is automatically closed here
    }
}


