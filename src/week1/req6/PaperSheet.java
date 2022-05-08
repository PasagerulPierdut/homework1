package week1.req6;

public class PaperSheet {

    private String size;

    public PaperSheet(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "(size=" + size + " mm" +
                ')';
    }
}
