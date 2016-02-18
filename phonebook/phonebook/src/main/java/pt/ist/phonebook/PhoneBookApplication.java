package pt.ist.phonebook;

import pt.ist.fenixframework.Atomic;
import pt.ist.phonebook.domain.PhoneBook;
import pt.ist.phonebook.exception.PhoneBookException;
import pt.ist.phonebook.persentation.PhoneBookPresenter;
import pt.ist.phonebook.service.ListPersonsService;
import pt.ist.phonebook.service.dto.PersonSimpleDto;

public class PhoneBookApplication
{
    @Atomic
    public static void main( String[] args )
    {
        PhoneBook pb = PhoneBook.getInstance();
        setupIfNeeded(pb);
        ListPersonsService s = new ListPersonsService();
        try {
            s.dispatch();
            for (PersonSimpleDto dto : s.getResult().getPersons()) {
                System.out.println("List of People:");
                System.out.println(dto.getName());
            }
        } catch (PhoneBookException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void setupIfNeeded(PhoneBook pb) {
        if (pb.getPersonSet().isEmpty())
            SetupDomain.populateDomain();
    }

}
