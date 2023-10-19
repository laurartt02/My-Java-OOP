package com.laurartt02.exercises.oop.phonebook;
import java.util.ArrayList;
/**
 * A phone book implementation internally using ArrayList. Its capacity is limited to 256 persons.
 *
 * @author lauraratti
 * @see PhoneBook Interface
 */
public class PhoneBookList {
    public static final int MAX_PERSONS = 256;
    final ArrayList<Person> phoneBook;
    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    public boolean addPerson(Person p) {
        if(phoneBook.contains(p)) {
            return false;
        }
        if(phoneBook.size() >= MAX_PERSONS) {
            return false;
        }
        return phoneBook.add(p);
    }

    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p: phoneBook) {
            if(p.getLastname().equals(lastname)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook) {
            if(p.getLastname().equals(lastname) && p.getName().equals(name)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }

}
