package TEMA_POO;

import java.util.ArrayList;

public class User extends Consumer{
    private ArrayList<String> companies;

    public User() {
        this.companies = new ArrayList<String>();
    }

    public Employee convert() {
        Employee employee = new Employee();

        employee.setResume(this.getResume());
        employee.setFriends(this.getFriends());

        return employee;
    }

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

    public Double getTotalScore() {
       int years = nrYearsOfExperience();
       Double meanGPA = super.meanGPA();

       return (years * 1.5 + meanGPA);
    }

    public ArrayList<String> getCompanies() {
        return this.companies;
    }

    public void setCompanies(ArrayList<String> companies) {
        this.companies = companies;
    }
}
