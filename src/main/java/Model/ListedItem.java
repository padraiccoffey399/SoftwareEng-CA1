package Model;

import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public class ListedItem {
    private String title;
    private String description;
    private LocalDate listDate;
    private Image[] images;
    private double price;
    private String location;

    public ListedItem(String title, String description, LocalDate listDate, double price, String location) {
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
    }


}
