package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ListedItemTest {
    ListedItem listedOne, listedTwo;
    //String name, String email, int age
    User userOne = new User("Max", "max@email.com", 22);
    User userTwo = new User("Max2", "max2@email.com", 44);
    LocalDate now = LocalDate.now();
    @BeforeEach
    void setUp() throws Exception {
        //String title, String description, LocalDate listDate, double price, String location, User seller
        listedOne = new ListedItem("Headphones", "Sony Headphones", now, 25.55, "SETU Arena", userOne, Categories.ELECTRONICS);
        listedTwo = new ListedItem("Laptop", "Dell XPS Laptop", now, 934.44, "SETU Viking Hall", userTwo, Categories.ELECTRONICS);
    }

    @AfterEach
    void tearDown() {
        listedOne = listedTwo = null;
        userOne = null;
    }

    @Test
    void getTitle() {
        assertEquals("Headphones", listedOne.getTitle());
        assertEquals("Laptop", listedTwo.getTitle());
    }

    @Test
    void setTitle() {
        listedOne.setTitle("Sony Headphones");
        assertEquals("Sony Headphones", listedOne.getTitle());
    }

    @Test
    void getDescription() {
        assertEquals("Dell XPS Laptop", listedTwo.getDescription());
        assertEquals("Sony Headphones", listedOne.getDescription());
    }

    @Test
    void setDescription() {
        listedTwo.setDescription("Dell XPS 13\" Laptop");
        assertEquals("Dell XPS 13\" Laptop", listedTwo.getDescription());
    }

    @Test
    void getListDate() {
        assertEquals(now, listedOne.getListDate());
        assertEquals(now, listedTwo.getListDate());
    }

    @Test
    void getImages() {
        assertNotNull(listedOne.getImages());
        assertNotNull(listedTwo.getImages());
    }

    @Test
    void setImages() {
        //can't really test
    }

    @Test
    void addImage() {
        //can't really test
    }

    @Test
    void removeImage() {
        //can't really test
    }

    @Test
    void getPrice() {
        assertEquals(25.55, listedOne.getPrice());
        assertEquals(934.44, listedTwo.getPrice());
    }

    @Test
    void setPrice() {
        listedOne.setPrice(10.40);
        assertEquals(10.40, listedOne.getPrice());
    }

    @Test
    void getLocation() {
        assertEquals("SETU Arena", listedOne.getLocation());
        assertEquals("SETU Viking Hall", listedTwo.getLocation());
    }

    @Test
    void setLocation() {
        listedOne.setLocation("SETU Library");
        assertEquals("SETU Library", listedOne.getLocation());
    }

    @Test
    void getSeller() {
        assertEquals(userOne, listedOne.getSeller());
        assertEquals(userTwo, listedTwo.getSeller());
    }
}