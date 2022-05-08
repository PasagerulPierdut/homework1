package week1.req6;

public class MailAccount extends Account {

    private String mailProvider;

    public MailAccount(String username, String password, String mailProvider) {
        super(username, password);
        this.mailProvider = mailProvider;
    }

    public String getMailProvider() {
        return mailProvider;
    }

    public void setMailProvider(String mailProvider) {
        this.mailProvider = mailProvider;
    }
}
