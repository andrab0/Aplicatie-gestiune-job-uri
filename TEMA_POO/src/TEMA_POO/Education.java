package TEMA_POO;

import java.util.Date;
import java.util.TreeSet;
import java.util.function.IntFunction;

public class Education extends TreeSet<Education> implements Comparable{
    private Date beginning;
    private Date ending;
    private String institution;
    private String level;
    private float GPA;
    private int yearBeginning, yearEnding;
    private int monthBeginning, monthEnding;
    private int dayBeginning, dayEnding;

    public Education(String institution, String level, float GPA,
                     int yearBeginning, int monthBeginning, int dayBeginning,
                     int yearEnding, int monthEnding, int dayEnding)
            throws InvalidDatesException {
        this.beginning = new Date(yearBeginning, monthBeginning, dayBeginning);
        this.ending = new Date(yearEnding, monthEnding, dayEnding);
        this.institution = institution;
        this.level = level;
        this.GPA = GPA;

        if(this.ending.after(this.beginning)) {
            throw new InvalidDatesException();
        }
    }

    public Education() {};

    @Override
    public int compareTo(Object object) {
        Education education = (Education) object;

        if (ending.equals(null)) {
            if (getBeginning().after(education.getBeginning()))
                return 1;
            else
                return -1;
        }

        if (ending.after(education.getEnding()))
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
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

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }
}
