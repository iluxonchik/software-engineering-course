package pt.ist.phonebook.domain;

import pt.ist.fenixframework.FenixFramework;

public class PhoneBook extends PhoneBook_Base {

    public static PhoneBook getInstance() {
        PhoneBook pb = FenixFramework.getDomainRoot().getPhonebook();
        if (pb == null)
            pb = new PhoneBook();
        return pb;
    }
    private PhoneBook() {
        FenixFramework.getDomainRoot().setPhonebook(this);
    }
    @Override
    public String toString() {
        String res = "";

        for (Person p : this.getPersonSet()) {
            res += "The Contact Book of " + p.getName() + ":\n";
            for (Contact c : p.getContactSet()) {
                res += "\t Name: " + c.getName() + " phone: " +
                        c.getPhoneNumber() + "\n";
            }
        }
        return res;
    }

}
