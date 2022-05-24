package model;
public class Document{
    private double price;
    private String year;
    private String image;
    public Document(double p, String y, String i){
        price=p;
        year=y;
        image=i;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}