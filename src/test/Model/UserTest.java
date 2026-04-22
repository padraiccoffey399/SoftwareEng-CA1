package Model;

import Main.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    @Nested
    class DriverTest {
        private Driver driver = new Driver();

        @BeforeEach
        void setUp() {
            for (int i = 0; i < 30; ++i) {
                driver.addUser(new User("User " + i, "email@gmail.com" + i, i));
            }
        }


        @Test
        void addUser() {
            assertNull(driver.getUser(30));
            assertEquals(30, driver.userCount());
            driver.addUser(new User("Tim", "email", 2));
            assertEquals(31, driver.userCount());
            assertEquals("Tim", driver.getUser(30).getName());
        }

        @Test
        void removeUser() {
            assertEquals("User 29",driver.getUser(29).getName());
            assertEquals(30,driver.userCount());
            driver.removeUser(29);
            assertEquals(29,driver.userCount());
            assertNull(driver.getUser(29));
        }

        @Test
        void getName() {
            User user = new User("John", "john@email.com", 25);
            assertEquals("John", user.getName());
        }

        @Test
        void getEmail() {
            User user = new User("John", "john@email.com", 25);
            assertEquals("john@email.com", user.getEmail());
        }

        @Test
        void getAge() {
            User user = new User("John", "john@email.com", 25);
            assertEquals(25, user.getAge());
        }

        @Test
        void setName() {
            User user = new User("John", "john@email.com", 25);
            user.setName("Alice");
            assertEquals("Alice", user.getName());
        }

        @Test
        void setEmail() {
            User user = new User("John", "john@email.com", 25);
            user.setEmail("alice@email.com");
            assertEquals("alice@email.com", user.getEmail());
        }

        @Test
        void setAge() {
            User user = new User("John", "john@email.com", 25);
            user.setAge(30);
            assertEquals(30, user.getAge());
        }

        @Test
        void testToString() {
            User user = new User("John", "john@email.com", 25);

            String expected = "Name: John, Email: john@email.com, Age: 25";
            assertEquals(expected, user.toString());
        }
    }
}