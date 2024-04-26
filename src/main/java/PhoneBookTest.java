import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("John", "1234567890"));
        assertEquals(2, phoneBook.add("Jane", "9876543210"));
        assertEquals(2, phoneBook.add("John", "1111111111")); // Повторное добавление
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        assertEquals("John", phoneBook.findByNumber("1234567890"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        assertEquals("1234567890", phoneBook.findByName("John"));
        assertNull(phoneBook.findByName("Jane")); // Несуществующее имя
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        phoneBook.add("Jane", "9876543210");
        phoneBook.printAllNames();
    }
}
