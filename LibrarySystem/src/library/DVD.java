package library;

public class DVD extends LibraryItem{

    private String languages;
    private String subTitles;
    private String producer;
    private String actors;

    public DVD(String ISBN, String title, String sector, String publication_date, String languages, String subTitles, String producer, String actors) {
        super(ISBN, title, sector, publication_date);
        this.languages = languages;
        this.subTitles = subTitles;
        this.producer = producer;
        this.actors = actors;
    }


    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSubTitles() {
        return subTitles;
    }

    public void setSubTitles(String subTitles) {
        this.subTitles = subTitles;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
