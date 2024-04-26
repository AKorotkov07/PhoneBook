import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneNumbersToNames;

    public PhoneBook() {
        this.phoneNumbersToNames = new HashMap<>();
    }

    public void addName(String name, String phoneNumber) {
        phoneNumbersToNames.put(phoneNumber, name);
    }

    public String findByName(String phoneNumber) {
        return phoneNumbersToNames.get(phoneNumber);
    }

    public int size() {
        return phoneNumbersToNames.size();
    }
}
