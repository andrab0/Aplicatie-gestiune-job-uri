package TEMA_POO;

import java.util.ArrayList;
import java.util.TreeSet;

public class Company {
    private String companyName;
    private Manager manager;
    private TreeSet<Department> departments;
    private TreeSet<Recruiter> recruiters;

    public Company(String companyName, Manager manager) {
        this.companyName = companyName;
        this.manager = manager;
        this.departments = new TreeSet<Department>() {};
        this.recruiters = new TreeSet<Recruiter>() {};
    }

    public Company() {
        this.departments = new TreeSet<Department>() {};
        this.recruiters = new TreeSet<Recruiter>() {};
    }

    public void add(Department department) {
        this.departments.add(department);
    }

    public void add(Recruiter recruiter) {
        this.recruiters.add(recruiter);
    }

    public void add(Employee employee, Department department) {
        for (Department i : departments) {
            if (i.equals(department)) {
                i.add(employee);
            }
        }
    }

    public void remove(Employee employee) {
        for (Department i : departments) {
            i.getEmployees().remove(employee);
        }
    }

    public void remove(Department department) {
        this.departments.remove(department);
    }

    public void remove(Recruiter recruiter) {
        this.recruiters.remove(recruiter);
    }

    public void move(Department source, Department destination) {
        departments.add(destination);

        for (Employee i : source.getEmployees())
            destination.add(i);

        departments.remove(source);
    }

    public void move(Employee employee, Department newDepartment) {
        for (Department i : departments) {
            if (i.getEmployees().contains(employee)) {
                newDepartment.add(employee);
                i.remove(employee);
            }
        }
    }

    public boolean contains(Department department) {
        for (Department i : departments) {
            if (i.equals(department))
                return true;
        }

        return false;
    }

    public boolean contains(Employee employee) {
        for (Department i : departments) {
            if (i.getEmployees().contains(employee))
                return true;
        }
        return false;
    }

    public boolean contains(Recruiter recruiter) {
        for (Recruiter i : recruiters) {
            if (i.equals(recruiter))
                return true;
        }
        return false;
    }

    // TO_DO;;
    public Recruiter getRecruiter(User user) {
        return null;
    }

    public ArrayList<Job> getJobs() {
        ArrayList<Job> jobs = new ArrayList<Job>();

        for (Department i : departments) {
            i.getJobs().forEach(jobs::add);
        }
        return jobs;
    }


    // Getteri + setteri
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public TreeSet<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(TreeSet<Department> departments) {
        this.departments = departments;
    }

    public TreeSet<Recruiter> getRecruiters() {
        return recruiters;
    }

    public void setRecruiters(TreeSet<Recruiter> recruiters) {
        this.recruiters = recruiters;
    }
}
