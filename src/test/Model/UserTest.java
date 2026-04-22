package Model;

import Main.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

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


        @org.junit.jupiter.api.Test
        void addUser() {
            assertNull(driver.getUser(30));
            assertEquals(30, driver.userCount());
            driver.addUser(new User("Tim", "email", 2));
            assertEquals(31, driver.userCount());
            assertEquals("Tim", driver.getUser(30).getName());
        }

        @org.junit.jupiter.api.Test
        void removeUser() {
            assertEquals("User 29",driver.getUser(29).getName());
            assertEquals(30,driver.userCount());
            driver.removeUser(29);
            assertEquals(29,driver.userCount());
            assertNull(driver.getUser(29));
        }


        @org.junit.jupiter.api.AfterEach
        void tearDown() {
        }

        @org.junit.jupiter.api.Test
        void getName() {
        }

        @org.junit.jupiter.api.Test
        void getEmail() {
        }

        @org.junit.jupiter.api.Test
        void getAge() {
        }

        @org.junit.jupiter.api.Test
        void setName() {
        }

        @org.junit.jupiter.api.Test
        void setEmail() {
        }

        @org.junit.jupiter.api.Test
        void setAge() {
        }

        @org.junit.jupiter.api.Test
        void testToString() {
        }
    }
}