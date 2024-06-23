import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test void constructorAndGets() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        assertEquals("Seattle", testCity.getName());
        assertEquals("United States", testCity.getCountry());
        assertEquals("Washington", testCity.getState());
        assertEquals(12345, testCity.getPopulation());
    }

    @Test void partialConstructor() {
        City testCity = new City("Sofia", "Bulgaria", 38839);
        assertEquals("Sofia", testCity.getName());
        assertEquals("Bulgaria", testCity.getCountry());
        assertEquals("None", testCity.getState());
        assertEquals(38839, testCity.getPopulation());
    }

    @Test
    void setName() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        testCity.setName("Spokane");
        assertEquals("Spokane", testCity.getName());
        assertThrows(IllegalArgumentException.class, () -> testCity.setName(""));
    }

    @Test
    void setCountry() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        testCity.setCountry("Canada");
        assertEquals("Canada", testCity.getCountry());
        assertThrows(IllegalArgumentException.class, () -> testCity.setCountry(""));
    }

    @Test
    void setState() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        testCity.setState("California");
        assertEquals("California", testCity.getState());
        assertThrows(IllegalArgumentException.class, () -> testCity.setState(""));
    }

    @Test
    void setPopulation() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        testCity.setPopulation(54321);
        assertEquals(54321, testCity.getPopulation());
        assertThrows(IllegalArgumentException.class, () -> testCity.setPopulation(-10));
    }

    @Test
    void testToString() {
        City testCity = new City("Seattle", "United States", "Washington", 12345);
        assertFalse(testCity.toString().isEmpty());
        assertFalse("/^City@".matches(testCity.toString()));
    }

    @Test
    void compareTo() {
        City firstCity = new City("Los Angeles", "United States", "California", 2345);
        City secondCity = new City("Seattle", "United States", "Washington", 123);
        assertTrue(firstCity.compareTo(secondCity) < 0);
    }
}