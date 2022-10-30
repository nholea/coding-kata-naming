package domain;

import java.util.ArrayList;

public interface PhoneCallRepository {

    ArrayList<String> getCalledNumbers(int clientId);

}
