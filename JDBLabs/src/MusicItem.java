public class MusicItem {
    private int id;
    private String tittle;
    private String artist;
    private String releaseDate;
    private float listPrice;
    private float price;
    private int version;

    public MusicItem(int id, String tittle, String artist, String releaseDate, float listPrice, float price, int version) {
        this.id = id;
        this.tittle = tittle;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.listPrice = listPrice;
        this.price = price;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return tittle;
    }

    public String getArtist() {
        return artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public float getListPrice() {
        return listPrice;
    }

    public float getPrice() {
        return price;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + tittle + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", listPrice='" + listPrice + '\'' +
                ", price='" + price + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}