package logic_coverage.domasna4;

public class VacationPlans {

    public void canGoOnVacation(Person person, VacationDates vacationDates) {
        System.out.println("This program checks if a person can go on a vacation during a particular time.");

        boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays == 1)));

        if (canGo) {
            System.out.println("The person " + person.name + " " + person.surname + " can go on a vacation.");
        } else {
            System.out.println("The person " + person.name + " " + person.surname + " can go on a vacation.");
        }
    }
}
