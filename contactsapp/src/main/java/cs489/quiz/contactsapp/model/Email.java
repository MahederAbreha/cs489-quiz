package cs489.quiz.contactsapp.model;

public class Email {

    private Long emailId;
    private String emailAddress;
    private String label;

    public Email() {
    }

    public Email(Long emailId, String emailAddress, String label) {
        this.emailId = emailId;
        this.emailAddress = emailAddress;
        this.label = label;
    }

    public String toJSONString() {
        return String.format("{\"emailId\": %d, \"emailAddress\": \"%s\", \"label\": \"%s\"}",
                emailId, emailAddress, label);
    }
}
