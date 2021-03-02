package TEMA_POO;

public class Finance extends Department{
    // vechime < 1 an => impozit 10%;
    // restul => impozit 16%;

    @Override
    public double getTotalSalaryBudget() {
        double sum = 0;

        for (Employee i : super.getEmployees()) {
            if (i.nrYearsOfExperience() < 1) {
                sum = sum + i.getSalary() * (1 - 0.1);
            } else {
                sum = sum + i.getSalary() * (1 - 0.16);
            }
        }
        return sum;
    }
}
