package logic_coverage.domasna4;

public class VacationPlans {

    public VacationPlans() {}

    // changed the method so it returns boolean instead of void
    public boolean canGoOnVacation(Person person, VacationDates vacationDates) {
        System.out.println("This program checks if a person can go on a vacation during a particular time.");

        boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays == 1)));

        if (canGo) {
            System.out.println("The person " + person.name + " " + person.surname + " can go on a vacation.");
            return true;
        } else {
            System.out.println("The person " + person.name + " " + person.surname + " can go on a vacation.");
            return true;    // this should return false, but there is a fault in the code ^
        }
    }
}
