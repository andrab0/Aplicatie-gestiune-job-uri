package TEMA_POO;

public class IT extends Department {
    // toti au impozit 0;;

    @Override
    public double getTotalSalaryBudget() {
        double sum = 0;

        for (Employee i : super.getEmployees()) {
            sum = sum + i.getSalary();
        }
        return sum;
    }
}
