package pt.ist.phonebook.service;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.phonebook.domain.Person;
import pt.ist.phonebook.domain.PhoneBook;
import pt.ist.phonebook.exception.PhoneBookException;
import pt.ist.phonebook.service.dro.PersonSimpleDto;
import pt.ist.phonebook.service.dro.PhoneBookDto;

import java.util.ArrayList;
import java.util.List;

public class ListPersonsService extends PhoneBookService {
    private PhoneBookDto result;

    @Override
    public final void dispatch() throws PhoneBookException {
        PhoneBook pb = FenixFramework.getDomainRoot().getPhonebook();
        List<PersonSimpleDto> personList = new ArrayList<PersonSimpleDto>();

        for (Person p : pb.getPersonSet()) {
            PersonSimpleDto view = new PersonSimpleDto(p.getName());
            personList.add(view);
        }

        result = new PhoneBookDto(personList);
    }

    public PhoneBookDto getResult() {
        return result;
    }
}
