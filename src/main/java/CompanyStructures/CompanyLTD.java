package CompanyStructures;

public class CompanyLTD {
    private String companyFunder;
    private double startingCapital;
    private double actualCapital;

    public CompanyLTD(String companyFunder, double startingCapital, double actualCapital) {
        this.companyFunder = companyFunder;
        this.startingCapital = startingCapital;
        this.actualCapital = actualCapital;
    }

    public String getCompanyFunder() {
        return companyFunder;
    }

    public void setCompanyFunder(String companyFunder) {
        this.companyFunder = companyFunder;
    }

    public double getStartingCapital() {
        return startingCapital;
    }

    public void setStartingCapital(double startingCapital) {
        this.startingCapital = startingCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    @Override
    public double calculateProfit() {

    }
}
