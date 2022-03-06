package junit.class02;

public class PrimerNumberChecker {

    public Boolean validate(Integer primerNumber) {
        for (int i = 2; i < Math.sqrt(primerNumber * 1.0); ++i) {
            if (primerNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
