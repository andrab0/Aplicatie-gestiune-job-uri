package TEMA_POO;

public class Marketing extends Department {
    // salariu mai mare 5000 => impozit 10%
    // salariu mai mic 3000 => impozit 0;
    // restul => impozit 16%;

    @Override
    public double getTotalSalaryBudget() {
        double sum = 0;

        for (Employee i : super.getEmployees()) {
            if (i.getSalary() > 5000)
                sum = sum + i.getSalary()*(1 - 0.1);
            else
                if (i.getSalary() < 3000)
                    sum = sum + i.getSalary();
                else
                    sum = sum + i.getSalary()*(1 - 0.16);
        }
        return sum;
    }
}
