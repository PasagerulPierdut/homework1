package week1.req6;

public class Advertisement {

    String companyName;
    String message;

    public Advertisement(String companyName, String message) {
        this.companyName = companyName;
        this.message = message;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Our company ,'" + companyName + '\'' +
                ", '" + message;
    }
}
