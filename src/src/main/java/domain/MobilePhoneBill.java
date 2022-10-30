package domain;

import java.time.LocalDate;

public class MobilePhoneBill {
    private final Client client;
    private final String calledNumbers;
    private final LocalDate feeStartDate;
    private final LocalDate feeEndDate;
    private final Tax tax;


    public MobilePhoneBill(Client client, String calledNumbers, LocalDate feeStartDate, LocalDate feeEndDate, Tax tax) {
        this.client = client;
        this.calledNumbers = calledNumbers;
        this.feeStartDate = feeStartDate;
        this.feeEndDate = feeEndDate;
        this.tax = tax;
    }


    public void showInvoice(){

    }
}
