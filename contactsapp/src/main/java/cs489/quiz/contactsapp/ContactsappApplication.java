package cs489.quiz.contactsapp;

import cs489.quiz.contactsapp.model.Contact;
import cs489.quiz.contactsapp.model.Email;
import cs489.quiz.contactsapp.model.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

@SpringBootApplication
public class ContactsappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactsappApplication.class, args);
        var contacts = new Contact [3];
        contacts[0] = new Contact(1L, "David", "Sanger", "Argos LLC", "Sales Manager",null, null);
        contacts[1] = new Contact(2L, "Carlos", "Jimenez", "Zappos", "Director");
        contacts[2] = new Contact(3L, "Ali", "Gafar", "BMI Services", "HR Manager", null, null);
        var phoneNumbers = new ArrayList<>();

        phoneNumbers.add(new PhoneNumber(1L, "240-133-0011", "Home"));
        phoneNumbers.add(new PhoneNumber(2L, "240-112-0123", "Mobile"));
        phoneNumbers.add(new PhoneNumber(3L, "412-116-9988", "Work"));
        var emails = new ArrayList<>();
        emails.add(new Email(1L, "dave.sang@gmail.com", "Home"));
        emails.add(new Email(2L, "dsanger@argos.com", "Work"));
        emails.add(new Email(3L, "ali@bmi.com", "Work"));
        contacts[0].setPhoneNumber((PhoneNumber) phoneNumbers.get(0));
        contacts[0].setEmail((Email) emails.get(0));
        contacts[1].setPhoneNumber((PhoneNumber) phoneNumbers.get(1));
        contacts[2].setPhoneNumber((PhoneNumber) phoneNumbers.get(2));
        contacts[2].setEmail((Email) emails.get(2));


        System.out.println("Contacts in ascending order of last name:");
        List<Contact> contactList = List.of(contacts);
        contactList.stream()
                .sorted(comparing(Contact::getLastName))
                .forEach(contact -> System.out.println(contact.toJSONString()));


    }

}
