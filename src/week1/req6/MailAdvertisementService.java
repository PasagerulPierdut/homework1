package week1.req6;

public class MailAdvertisementService implements AdvertisementService {

    private MailAccount mailAccount;

    public MailAdvertisementService(MailAccount mailAccount) {
        this.mailAccount = mailAccount;
    }

    @Override
    public void advertise(Advertisement advertisement) {
        System.out.println("Sending to recipient list on" + mailAccount.getMailProvider() + "account:  " + advertisement);
    }
}
