package cs489.quiz.contactsapp.model;

public class PhoneNumber {

    private Long phoneNumberId;
    private String phoneNumber;
    private String label;

    public PhoneNumber() {
    }

    public PhoneNumber(Long phoneNumberId, String phoneNumber, String label) {
        this.phoneNumberId = phoneNumberId;
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public String toJSONString() {
        return String.format("{\"phoneNumberId\": %d, \"phoneNumber\": \"%s\", \"label\": \"%s\"}",
                phoneNumberId, phoneNumber, label);
    }

}
