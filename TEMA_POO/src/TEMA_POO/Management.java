package TEMA_POO;

public class Management extends Department{
    // toti impozit 16%

    @Override
    public double getTotalSalaryBudget() {
        double sum = 0;

        for (Employee i : super.getEmployees()) {
            sum = sum + i.getSalary() * (1 - 0.16);
        }
        return sum;
    }
}
