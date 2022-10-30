package infrastruture.repositories;

import domain.PhoneCall;
import domain.PhoneCallRepository;

import java.util.ArrayList;
import java.util.HashMap;

public class CallLog implements PhoneCallRepository {

    private final HashMap<Integer, PhoneCall> calledNumbersList = new HashMap<>();
    @Override
    public ArrayList<String> getCalledNumbers(int clientId) {
        return null;
    }
}
