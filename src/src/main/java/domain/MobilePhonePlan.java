package domain;

public class MobilePhonePlan {

    private final int id;

    private final String name;

    private final String description;
    private final int data;

    private final double smsPrice;

    private final double priceCallsPeakMinutes;
    private final double priceCallsNightMinutes;

    private final double planPrice;

    public MobilePhonePlan(int id, String name, String description, double sms, int data, double smsPrice, double priceCallsPeakMinutes, double priceCallsNightMinutes, double planPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.data = data;
        this.smsPrice = smsPrice;
        this.priceCallsPeakMinutes = priceCallsPeakMinutes;
        this.priceCallsNightMinutes = priceCallsNightMinutes;
        this.planPrice = planPrice;
    }
}
