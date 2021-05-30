package library;

public class LibraryItem implements  Comparable<LibraryItem>{
    private String ISBN;
    private String title;
    private String sector;
    private String Publication_date;
    private DateTime borrowed_date_time;
    private DateTime return_date_time;
    private String current_reader;
    private DateTime nextAvailable_date;
    private DateTime returnDate;
    private double fine;
    private Integer overdueDays;

    public LibraryItem(String ISBN, String title, String sector, String publication_date) {
        this.ISBN = ISBN;
        this.title = title;
        this.sector = sector;
        Publication_date = publication_date;
    }

    public LibraryItem(String ISBN, DateTime borrowed_date_time, String current_reader) {
        this.ISBN = ISBN;
        this.borrowed_date_time = borrowed_date_time;
        this.current_reader = current_reader;
    }

    public LibraryItem(String ISBN, DateTime return_date_time, double fine, Integer overdueDays) {
        this.ISBN = ISBN;
        this.return_date_time = return_date_time;
        this.fine = fine;
        this.overdueDays = overdueDays;
    }

    public DateTime getNextAvailable_date() {
        return nextAvailable_date;
    }

    public void setNextAvailable_date(DateTime nextAvailable_date) {
        this.nextAvailable_date = nextAvailable_date;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public DateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(DateTime returnDate) {
        this.returnDate = returnDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPublication_date() {
        return Publication_date;
    }

    public void setPublication_date(String publication_date) {
        Publication_date = publication_date;
    }

    public DateTime getBorrowed_date_time() {
        return borrowed_date_time;
    }

    public void setBorrowed_date_time(DateTime borrowed_date_time) {
        this.borrowed_date_time = borrowed_date_time;
    }

    public String getCurrent_reader() {
        return current_reader;
    }

    public void setCurrent_reader(String current_reader) {
        this.current_reader = current_reader;
    }

    public DateTime getReturn_date_time() {
        return return_date_time;
    }

    public void setReturn_date_time(DateTime return_date_time) {
        this.return_date_time = return_date_time;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", sector='" + sector + '\'' +
                ", Publication_date='" + Publication_date + '\'' +
                ", borrowed_date_time=" + borrowed_date_time +
                ", current_reader='" + current_reader + '\'' +
                '}';
    }

    @Override
    public int compareTo(LibraryItem o) {
       if(overdueDays==o.overdueDays){
           return  0;
       }else if (overdueDays>o.overdueDays){
           return 1;

        }else {
           return -1;
        }
    }


}
