package library;

public class Reader {

    private int ID;
    private String nameOfReader;
    private int mobile;
    private String e_mail;

    public Reader(int ID, String nameOfReader, int mobile, String e_mail) {
        this.ID = ID;
        this.nameOfReader = nameOfReader;
        this.mobile = mobile;
        this.e_mail = e_mail;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameOfReader() {
        return nameOfReader;
    }

    public void setNameOfReader(String nameOfReader) {
        this.nameOfReader = nameOfReader;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
