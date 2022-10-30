package domain;

import java.time.LocalDateTime;

public class PhoneCall {

    private final String sourcePhoneNumber;

    private final String targetPhoneNumber;

    private final LocalDateTime startedAt;

    private final int minutes;

    public PhoneCall(String sourcePhoneNumber, String targetPhoneNumber, LocalDateTime startedAt, int minutes) {
        this.sourcePhoneNumber = sourcePhoneNumber;
        this.targetPhoneNumber = targetPhoneNumber;
        this.startedAt = startedAt;
        this.minutes = minutes;
    }
}
