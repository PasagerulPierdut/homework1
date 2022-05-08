package week1.req6;

public class PaperService implements AdvertisementService {

    private PaperSheet paper;

    public PaperService(PaperSheet paper) {
        this.paper = paper;
    }

    @Override
    public void advertise(Advertisement advertisement) {
        System.out.println("Printing on paper " + paper + ": " + advertisement);
    }
}
