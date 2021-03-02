package TEMA_POO;

public class Recruiter extends Employee {
    private float rating;

    public Recruiter() {
        super();
        this.rating = 5;
        String companyName;
        companyName = getCompany();
        for (Department i : Application.getInstance().getCompany(companyName).getDepartments()) {
            if (i instanceof IT)
                i.add(this);
        }
    }

    // TO_DO;;
    public int evaluate(Job job, User user) {
        return 0;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
