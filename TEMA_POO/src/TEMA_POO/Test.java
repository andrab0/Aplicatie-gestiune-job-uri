package TEMA_POO;

import java.util.Date;

public class Test {
    public static void main(String args[]) {
        User u1  = new User();
        User u2 = new User();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        Consumer.Resume.ResumeBuilder googleManagerResume = new Consumer.Resume.ResumeBuilder();
        Information info = new Information("Black Johnny", "test@gmail.com", "+40712345678", "Masculin", 1980, 6, 9);
        info.setLanguage("english", "Experienced");
        Education education = new Education();
        education.setInstitution("General Highschool of London");
        education.setBeginning(new Date(1995, 7, 15));
        education.setEnding(new Date(1999, 6, 15));
        education.setGPA((float) 9.14);
        education.setLevel("highschool");


        Manager googleManager = new Manager();
        googleManager.setCompany("Google");
        googleManager.setSalary(1000);
        googleManager.setResume(googleManagerResume.information(info).educations(education).build());

        Company Google = new Company();
        Google.setCompanyName("Google");
        Google.setManager(googleManager);
    }
}

class Complex extends Comparable<> {

}