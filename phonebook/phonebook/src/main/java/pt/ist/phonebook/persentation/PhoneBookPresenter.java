package pt.ist.phonebook.persentation;

import pt.ist.phonebook.service.dto.PersonSimpleDto;
import pt.ist.phonebook.service.dto.PhoneBookDto;

public class PhoneBookPresenter {
    public static void show(PhoneBookDto dto) {
        System.out.println("List of Persons: ");
        for (PersonSimpleDto p : dto.getPersons()) {
            PersonSimplePresenter.show(p);
        }
    }
}
