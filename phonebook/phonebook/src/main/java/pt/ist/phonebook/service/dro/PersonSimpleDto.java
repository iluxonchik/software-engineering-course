package pt.ist.phonebook.service.dro;

/**
 * Created by iluxonchik on 18-02-2016.
 */
public class PersonSimpleDto {
    private String name;

    public PersonSimpleDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
