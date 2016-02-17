package pt.ist.phonebook.domain;

public class Person extends Person_Base {
    
    public Person() {
        super();
    }

    @Override
    public void addContact(Contact newContact) {
        for (Contact c : getContactSet()) {
            if (c.getName().equals(newContact.getName())) {
                throw new IllegalArgumentException("A Person instance cannot " +
                        "have two or more Contact instances with the same name.");
            }
        }
        super.addContact(newContact);
    }
    
}
