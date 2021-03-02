package TEMA_POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public abstract class Consumer {
    public static class Resume {
        private Information information;
        private TreeSet<Education> educations;
        private TreeSet<Experience> experiences;

        private Resume(ResumeBuilder resumeBuilder) {
            this.information = resumeBuilder.information;
            this.educations = resumeBuilder.educations;
            this.experiences = resumeBuilder.experiences;
        }

        static class ResumeBuilder {
            private Information information;
            private TreeSet<Education> educations;
            private TreeSet<Experience> experiences;

            public ResumeBuilder information(Information information) {
                this.information = new Information();
                this.information = information;
                return this;
            }

            public ResumeBuilder educations(Education educations) {
                this.educations = new TreeSet<Education>();
                this.educations = educations;
                return this;
            }

            public ResumeBuilder experiences(TreeSet<Experience> experiences) {
                this.experiences = new TreeSet<Experience>();
                this.experiences = experiences;
                return this;
            }

            public Resume build() {
                return new Resume(this);
            }
        }

        public Information getInformation() {
            return information;
        }

        public void setInformation(Information information) {
            this.information = information;
        }

        public TreeSet<Education> getEducations() {
            return educations;
        }

        public void setEducations(TreeSet<Education> educations) {
            this.educations = educations;
        }

        public TreeSet<Experience> getExperiences() {
            return experiences;
        }

        public void setExperiences(TreeSet<Experience> experiences) {
            this.experiences = experiences;
        }
    }

    private Resume resume;
    private ArrayList<Consumer> friends;

    public Consumer(){
        this.resume = null;
        this.friends = new ArrayList<Consumer>();
    }

    public Consumer(Resume resume, ArrayList<Consumer> friends) {
        this.resume = resume;
        this.friends = new ArrayList<Consumer>();
        this.friends = friends;
    }

    public void add(Education education) {
        this.resume.educations.add(education);
    }

    public void add(Experience experience) {
        this.resume.experiences.add(experience);
    }

    public void add(Consumer consumer) {
        this.friends.add(consumer);
    }

    public int getDegreeInFriendship(Consumer consumer) {
        ArrayList<Consumer> prietenasi = this.getFriends();
        ArrayList<Consumer> vizitati = new ArrayList<Consumer>();
        int degree = 0;
        vizitati.add(this);
        // consumer-ul este acelasi cu obiectul meu
        if (this.equals(consumer))
            return degree;

        // consumer-ul se afla in lista de prieteni a obiectului meu
        for (Consumer i : prietenasi) {

            if (!vizitati.contains(i)) {
                vizitati.add(i);

                if (i.equals(consumer)) {
                    degree++;
                    return degree;
                }
            }
        }

        // chiar mi-am dat silinta, dar atat s-a putut
        return -1;
    }

    public void remove(Consumer consumer) {
        this.friends.remove(consumer);
    }

    public Integer getGraduationYear() {
        for (Education i: resume.getEducations()) {
            if (i.getLevel().equals("college"))
                return i.getYearEnding();
        }
        return null;
    }

    public Double meanGPA() {
        double sum = 0;
        int count = 0;
        double var;
        double mean;

        for (Education i : resume.getEducations()) {
            var = i.getGPA();
            count++;
            sum += var;
        }

        mean = sum/count;
        return mean;
    }

    // Getteri + setteri:
    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public ArrayList<Consumer> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Consumer> friends) {
        this.friends = friends;
    }
}
