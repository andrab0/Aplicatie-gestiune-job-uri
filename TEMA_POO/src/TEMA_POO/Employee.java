package TEMA_POO;

public class Employee extends Consumer{
    private String company;
    private float salary;

    public Employee(String company, float salary) {
        this.company = company;
        this.salary = salary;
    }

    public Employee() {};

    public Integer nrYearsOfExperience() {
        long number;
        long sum = 0;
        int years = 0;

        for(Experience i: super.getResume().getExperiences()) {
            number = ((i.getEnding().getTime() - i.getBeginning().getTime()) / (1000 * 60 * 60 * 24));
            sum += number;
        }

        while(sum > 365) {
            years++;
            sum -= 365;
        }

        if (sum >= 92)
            years++;

        return years;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
