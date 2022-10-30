package domain;

import infrastruture.repositories.Pho;

import java.time.LocalDate;

public class MobilePhoneBill {

    private int id;
    private final ClientRepository clientRepository;

    private final PhoneCallRepository phoneCallRepository;
    private final LocalDate feeStartDate;
    private final LocalDate feeEndDate;
    private final Tax tax;


    public MobilePhoneBill(ClientRepository clientRepository,PhoneCallRepository phoneCallRepository, LocalDate feeStartDate, Tax tax) {
        this.clientRepository = clientRepository;
        this.phoneCallRepository = phoneCallRepository;
        this.feeStartDate = feeStartDate;
        this.feeEndDate = feeStartDate.plusMonths(1);
        this.tax = tax;
    }


    public void showInvoice(){

    }
}
