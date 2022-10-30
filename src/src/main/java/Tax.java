public class Tax {

    private final int minutes;
    private final double netFee;
    private final double grossFee;

    public Tax(int minutes, double netFee, double grossFee) {
        this.minutes = minutes;
        this.netFee = netFee;
        this.grossFee = grossFee;
    }
}
