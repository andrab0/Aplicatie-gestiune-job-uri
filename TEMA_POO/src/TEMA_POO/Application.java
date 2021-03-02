package TEMA_POO;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Application object = null;
    private ArrayList<Company> companies;
    private ArrayList<User> users;

    private Application() {
        this.companies = new ArrayList<Company>();
        this.users = new ArrayList<User>();

    }

    public static Application getInstance() {
        if (object == null) {
            object = new Application();
        }
        return object;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public Company getCompany(String name) {
        for (Company i : this.companies) {
            if(i.getCompanyName().equals(name))
                return i;
        }
        return null;
    }

    public void add(Company company) {
        this.companies.add(company);
    }

    public void add(User user) {
        this.users.add(user);
    }

    public boolean remove(Company company) {
        // verific daca compania exista si in
        // caz afirmativ o sterg
        if (companies.contains(company)) {
            companies.remove(company);
            return true;
        }

        // daca compania nu exista intorc false;
        return false;
    }

    public boolean remove(User user) {
        // verific daca user-ul exista si in caz
        // afirmativ il sterg

        if (users.contains(user)) {
            users.remove(user);
            return true;
        }
        // daca userul un exista intorc false;
        return false;
    }

    public ArrayList<Job> getJobs(List<String> companies) {
        ArrayList<Job> jobs = new ArrayList<Job>();

        for (Company i : this.companies) {
            for (String j : companies) {
                if (i.getCompanyName().equals(j)) {
                    ArrayList<Job> auxJobs = i.getJobs();

                    for (Job k : auxJobs) {
                        if(k.isFlag()) {
                            jobs.add(k);
                        }
                    }
                    auxJobs.clear();
                }
            }
        }
        return jobs;
    };


    // Getteri + setteri
    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
