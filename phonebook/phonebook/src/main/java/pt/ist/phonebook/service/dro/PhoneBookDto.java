package pt.ist.phonebook.service.dro;

import pt.ist.phonebook.domain.PhoneBook;

import java.util.List;

public class PhoneBookDto {
    private List<PersonSimpleDto> personList;

    public PhoneBookDto(List<PersonSimpleDto> personList) {
        this.personList = personList;
    }

    public List<PersonSimpleDto> getPersons() {
        return this.personList;
    }
}
