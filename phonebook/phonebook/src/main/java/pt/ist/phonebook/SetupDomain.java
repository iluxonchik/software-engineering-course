package pt.ist.phonebook;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;

import jvstm.Atomic;

import pt.ist.phonebook.domain.Person;
import pt.ist.phonebook.domain.PhoneBook;
import pt.ist.phonebook.domain.Contact;

public class SetupDomain {
    @Atomic
    public static void populateDomain() {
        PhoneBook pb = PhoneBook.getInstance();
        Person person = new Person("Jayceon");
        pb.addPerson(person);
        person.addContact(new Contact("Adre Young", 123456));
        person.addContact(new Contact("CPT", 789101));

    }

}
