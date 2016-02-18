package pt.ist.phonebook;

import pt.ist.fenixframework.Atomic;
import pt.ist.phonebook.domain.PhoneBook;

public class PhoneBookApplication
{
    @Atomic
    public static void main( String[] args )
    {
        PhoneBook pb = PhoneBook.getInstance();
        setupIfNeeded(pb);
        System.out.println(pb);
    }

    private static void setupIfNeeded(PhoneBook pb) {
        if (pb.getPersonSet().isEmpty())
            SetupDomain.populateDomain();
    }

}
