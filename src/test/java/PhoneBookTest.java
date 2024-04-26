import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addName("John", "123456789"); // Добавляем имя и номер телефона
        phoneBook.addName("Jane", "987654321"); // Добавляем имя и номер телефона
        phoneBook.addName("John", "123456789"); // Повторное добавление
        assertEquals(2, phoneBook.size()); // Проверяем, что размер коллекции равен 2
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addName("John", "123456789");
        phoneBook.addName("Jane", "987654321");
        assertEquals("John", phoneBook.findByName("123456789")); // Поиск по номеру
        assertEquals("Jane", phoneBook.findByName("987654321")); // Поиск по номеру
    }
}
