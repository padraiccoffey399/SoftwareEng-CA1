package Model;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class ListedItem {
    private String title;
    private String description;
    private final LocalDate listDate;
    private ArrayList<Image> images;
    private double price;
    private String location;
    private final User seller;
    private Categories category;

    public ListedItem(String title, String description, LocalDate listDate, double price, String location, User seller, Categories category) throws Exception {
        images = new ArrayList<>();
        if(title != null && title.length() < 50){
            this.title = title;
        }else{
            if(title != null)
                this.title = title.substring(0, 50);
        }
        if(description != null && description.length() < 150){
            this.description = description;
        }else{
            if(description != null)
                this.description = description.substring(0, 150);
        }

        this.listDate = Objects.requireNonNullElseGet(listDate, LocalDate::now);

        if(price > 0){
            this.price = price;
        }
        if(location != null && location.length() < 50){
            this.location = location;
        }else{
            if(location != null)
                this.location = location.substring(0, 50);
        }
        try {
            this.seller = Objects.requireNonNull(seller);
        }catch(NullPointerException e){
            throw new Exception("Seller must be non null!");
        }
        if(category != null){
            this.category = category;
        }else{
            throw new Exception("Category must be non null!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getListDate() {
        return listDate;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public void addImage(Image image){
        if(image != null)
            this.images.add(image);
    }

    public Image removeImage(Image image){
        return this.images.remove(images.indexOf(image));
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getSeller() {
        return seller;
    }
}
