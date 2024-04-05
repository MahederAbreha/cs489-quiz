package cs489.quiz.contactsapp.model;

public class Contact {

    private Email email;
    private PhoneNumber phoneNumber;
    private Long contactId;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;

    public Contact() {
    }

    public Contact(Long contactId, String firstName, String lastName, String company, String jobTitle, Long emailId, Long phoneNumberId) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.email = new Email(emailId, null, null);
        this.phoneNumber = new PhoneNumber(phoneNumberId, null, null);

    }
    public Contact(Long contactId, String firstName, String lastName, String company, String jobTitle) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Contact{");
        sb.append("contactId=").append(contactId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", jobTitle='").append(jobTitle).append('\'');
        sb.append(", email=").append(email);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append('}');
        return sb.toString();
    }


    public String toJSONString() {
        String emailJson = (email != null) ? email.toJSONString() : "null";
        String phoneNumberJson = (phoneNumber != null) ? phoneNumber.toJSONString() : "null";

        return String.format("{\"contactId\":%d,\"firstName\":\"%s\",\"lastName\":\"%s\",\"company\":\"%s\",\"jobTitle\":\"%s\",\"email\":%s,\"phoneNumber\":%s}",
                contactId, firstName, lastName, company, jobTitle, emailJson, phoneNumberJson);
    }

}
