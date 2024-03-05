package CompanyStructures;

public class Company {
    private String companyName;
    private String dateOfCreation;
    private String bulstat;

    public Company(java.lang.String companyName, java.lang.String dateOfCreation, java.lang.String bulstat) {
        this.companyName = companyName;
        this.dateOfCreation = dateOfCreation;
        setBulstat(bulstat);
    }

    public java.lang.String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }

    public java.lang.String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(java.lang.String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public java.lang.String getBulstat() {
        return bulstat;
    }

    public void setBulstat(java.lang.String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        }
    }
}
