package pt.ist.phonebook.persentation;

import pt.ist.phonebook.service.dro.PersonSimpleDto;

public class PersonSimplePresenter {

    public static void show(PersonSimpleDto dto) {
        System.out.println("Name: " + dto.getName());
    }
}
