package logic_coverage.domasna4;

public class VacationDates {

    public Boolean datesAreWorkingDays;

    public VacationDates(Boolean datesAreWorkingDays) {
        this.datesAreWorkingDays = datesAreWorkingDays;
    }

    public VacationDates() {}

    public Boolean getDatesAreWorkingDays() {
        return datesAreWorkingDays;
    }

    public void setDatesAreWorkingDays(Boolean datesAreWorkingDays) {
        this.datesAreWorkingDays = datesAreWorkingDays;
    }
}
