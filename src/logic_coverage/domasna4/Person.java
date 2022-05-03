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
}
