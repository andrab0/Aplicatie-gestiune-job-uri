package TEMA_POO;

import java.util.Date;
import java.util.HashMap;

public class Information {
    private String completName;
    private String email;
    private String telephone;
    private String sex;
    private Date birthday;
    private HashMap<String, String> language;

    public void setLangLevel(String langLevel) {
        this.langLevel = langLevel;
    }

    private String langLevel;

    // constructorul clasei
    public Information(String completName, String email, String telephone,
                       String sex, int year, int month, int day) {
        this.completName = completName;
        this.email = email;
        this.telephone = telephone;
        this.sex = sex;
        this.birthday = new Date(year, month, day);
        this.language = new HashMap<String, String>();
    }


    public Information() {
        this.language = new HashMap<String, String>();
    }

    public String getCompletName() {
        return completName;
    }

    public void setCompletName(String completName) {
        this.completName = completName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public HashMap<String, String> getLanguage() {
        return language;
    }

    public void setLanguage(String language, String langLevel) {
        this.language.put(language, langLevel);
    }
}
