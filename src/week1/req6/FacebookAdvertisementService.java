package week1.req6;

public class FacebookAdvertisementService implements AdvertisementService {

    private FacebookAccount account;

    public FacebookAdvertisementService(FacebookAccount account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(FacebookAccount account) {
        this.account = account;
    }

    public void connectToFacebook(FacebookAccount account) {
        System.out.println("Connecting to Facebook with username..." + account.getUsername());
    }

    @Override
    public void advertise(Advertisement advertisement) {

        if (!isValid(advertisement.getCompanyName())) {
            System.out.println("Company name not valid!");
        } else if (!isValid(advertisement.getMessage())) {
            System.out.println("Insert a message!");
        } else {
            connectToFacebook(account);
            System.out.println("Publishing on Facebook: " + advertisement);
        }
    }

    public boolean isValid(String s) {
        return (s != null && !s.equals(" "));
    }
}

