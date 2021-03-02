package TEMA_POO;

import java.util.Date;

public class Experience implements Comparable{
    private Date beginning;
    private Date ending;
    private String position;
    private String company;
    private int yearBeginning, yearEnding;
    private int monthBeginning, monthEnding;
    private int dayBeginning, dayEnding;


    public Experience(String position, String company, int yearBeginning,
                      int yearEnding, int monthBeginning, int monthEnding,
                      int dayBeginning, int dayEnding) throws InvalidDatesException {
        this.position = position;
        this.company = company;
        this.beginning = new Date(yearBeginning, monthBeginning, dayBeginning);
        this.ending = new Date(yearEnding, monthEnding, dayEnding);

        if(this.ending.after(this.beginning)) {
            throw new InvalidDatesException();
        }
    }

    public Experience() {};

    @Override
    public int compareTo(Object object) {
        Experience experience = (Experience) object;

        if (ending.equals(null)) {
            String name1 = this.company;
            String name2 = experience.getCompany();

            if (name1.equals(name2))
                return 0;

            if (name1.compareTo(name2) > 0)
                return -1;
            else
                return 1;
        }

        if (ending.after(experience.getEnding()))
            return 1;
        else
            return -1;
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearBeginning() {
        return yearBeginning;
    }

    public void setYearBeginning(int yearBeginning) {
        this.yearBeginning = yearBeginning;
    }

    public int getYearEnding() {
        return yearEnding;
    }

    public void setYearEnding(int yearEnding) {
        this.yearEnding = yearEnding;
    }

    public int getMonthBeginning() {
        return monthBeginning;
    }

    public void setMonthBeginning(int monthBeginning) {
        this.monthBeginning = monthBeginning;
    }

    public int getMonthEnding() {
        return monthEnding;
    }

    public void setMonthEnding(int monthEnding) {
        this.monthEnding = monthEnding;
    }

    public int getDayBeginning() {
        return dayBeginning;
    }

    public void setDayBeginning(int dayBeginning) {
        this.dayBeginning = dayBeginning;
    }

    public int getDayEnding() {
        return dayEnding;
    }

    public void setDayEnding(int dayEnding) {
        this.dayEnding = dayEnding;
    }
}
