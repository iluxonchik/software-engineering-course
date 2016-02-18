package pt.ist.phonebook;

import pt.ist.fenixframework.Atomic;
import pt.ist.phonebook.domain.PhoneBook;

public class PhoneBookApplication
{
    @Atomic
    public static void main( String[] args )
    {
        PhoneBook pb = PhoneBook.getInstance();
    }
}
