package logic_coverage.domasna4;

public class Person {

    public String name;
    public String surname;
    public Integer moneySaved;
    public Integer moneyNeeded;
    public Integer canUseVacationDays;  // can only have the values 0 or 1

    public Person(String name, String surname, Integer moneySaved, Integer moneyNeeded, Integer canUseVacationDays) {
        this.name = name;
        this.surname = surname;
        this.moneySaved = moneySaved;
        this.moneyNeeded = moneyNeeded;
        this.canUseVacationDays = canUseVacationDays;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getMoneySaved() {
        return moneySaved;
    }

    public void setMoneySaved(Integer moneySaved) {
        this.moneySaved = moneySaved;
    }

    public Integer getMoneyNeeded() {
        return moneyNeeded;
    }

    public void setMoneyNeeded(Integer moneyNeeded) {
        this.moneyNeeded = moneyNeeded;
    }

    public Integer getCanUseVacationDays() {
        return canUseVacationDays;
    }

    public void setCanUseVacationDays(Integer canUseVacationDays) {
        this.canUseVacationDays = canUseVacationDays;
    }
}
