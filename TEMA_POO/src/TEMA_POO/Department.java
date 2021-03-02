package TEMA_POO;

import java.util.ArrayList;

public abstract class Department {
    private ArrayList<Employee> employees;
    private ArrayList<Job> jobs;

    public Department() {
        this.employees = new ArrayList<Employee>();
        this.jobs = new ArrayList<Job>();
    }

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        return this.jobs;
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    public void add(Job job) {
        this.jobs.add(job);
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }
}
