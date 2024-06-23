import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreeTest {
    private BTree cityTree;
    private BTree emptyTree;
    @BeforeEach
    void setUp() {
        cityTree = new BTree();
        cityTree.addCity(new City("Seattle", "United States", "Washington", 12345));
        cityTree.addCity(new City("Sofia", "Bulgaria", 38839));
        cityTree.addCity(new City("Los Angeles", "United States", "California", 2345));
        emptyTree = new BTree();
    }

    @Test
    void getCount() {
       assertEquals(3, cityTree.getCount());
    }

    @Test
    void searchBT() {
        assertEquals("California", cityTree.searchBT("Los Angeles").getState());
        assertThrows(NullPointerException.class, () -> emptyTree.searchBT("empty"));
        assertThrows(NullPointerException.class, () -> cityTree.searchBT("empty"));
    }

    @Test
    void printTree() {
    assertTrue(cityTree.printTree().matches(" Name.*"));
    }

    @Test
    void listOfTemplate() {
        assertEquals(1, cityTree.listOfTemplate("Los Angeles").size());
    }

    @Test
    void clear() {
        cityTree.clear();
        assertEquals(0, cityTree.getCount());
    }
}