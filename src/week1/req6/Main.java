package week1.req6;

public class Main {

    public static void main(String[] args) {

        FacebookAccount account = new FacebookAccount("testUSer", "testPassword");
        MailAccount account2 = new MailAccount("testUser1", "pass1", "YahooMail");


        Advertisement advertisement = new Advertisement("BuildMonster", " is offering a wide range of construction tools and so on.");

        AdvertisementService facebookAdvertisementService = new FacebookAdvertisementService(account);
        AdvertisementService mailAdvertisementService = new MailAdvertisementService(account2);
        PaperService paperService = new PaperService(new PaperSheet("200 x 100"));

        facebookAdvertisementService.advertise(advertisement);
        mailAdvertisementService.advertise(advertisement);
        paperService.advertise(advertisement);
    }
}
