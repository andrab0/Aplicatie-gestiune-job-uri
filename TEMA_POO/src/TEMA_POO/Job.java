package TEMA_POO;

public class Job {
    private String jobName;
    private String companyName;
    private boolean flag;
    private Constraint  graduationYear,
                        yearsOfExperience,
                        GPA;

    public Job(String jobName, String companyName, boolean flag) {
        this.jobName = jobName;
        this.companyName = companyName;
        this.flag = flag;
    }

    public Job() {}


    // TO_DO;;
    public void apply(User user) {}

    public boolean meetsRequirments(User user) {return false;}

    // Getteri + Setteri:

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Constraint getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Constraint graduationYear) {
        this.graduationYear = graduationYear;
    }

    public Constraint getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Constraint yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Constraint getGPA() {
        return GPA;
    }

    public void setGPA(Constraint GPA) {
        this.GPA = GPA;
    }
}
