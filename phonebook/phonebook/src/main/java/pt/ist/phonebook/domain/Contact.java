package pt.ist.phonebook.domain;

public class Contact extends Contact_Base {
    
    public Contact(String name, int phoneNumber) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
    }

    @Override
    public void setPerson(Person person) {
        // NOTE: there is an actual relation (table) of Person - Contact,
        // so this will add both of the entries, the current contact and the person
        person.addContact(this);
    }
}
