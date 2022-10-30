import domain.MobilePhoneBill;
import domain.Tax;
import infrastruture.repositories.CallLog;
import infrastruture.repositories.ClientRegistration;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Tax tax = new Tax(0,0.0,0.0);
        LocalDate localDate = LocalDate.of(2022, 10, 30);
        CallLog callLog = new CallLog();
        ClientRegistration clientRegistration = new ClientRegistration();
        MobilePhoneBill mobilePhoneBill = new MobilePhoneBill(clientRegistration,callLog,localDate, tax);

        mobilePhoneBill.showInvoice();

    }
}
