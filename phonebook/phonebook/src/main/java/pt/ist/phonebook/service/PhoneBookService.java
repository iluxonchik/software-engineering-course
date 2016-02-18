package pt.ist.phonebook.service;

import jvstm.Atomic;
import pt.ist.phonebook.exception.PhoneBookException;

public abstract class PhoneBookService {

    @Atomic
    public void execute() throws PhoneBookException {
        dispatch();
    }

    protected abstract void dispatch() throws PhoneBookException;
}
