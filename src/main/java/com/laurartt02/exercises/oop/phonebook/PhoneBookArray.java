package com.laurartt02.exercises.oop.phonebook;

import java.util.Arrays;

/**
 * A phone book implementation internally using an array. Its capacity is limited to 256 persons.
 * @author lauraratti
 */
public class PhoneBookArray implements PhoneBook {
    public static final int MAX_PERSONS = 256;
    public final Person[] phoneBook;
    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }
    @Override
    public boolean addPerson(Person p) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if(phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            }
        }
        for (int i = 0; i < MAX_PERSONS; i++) {
            if(phoneBook[i] == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].equals(p)) {
                    phoneBook[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int k = 0;
        Person[] tmp = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].getLastname().equals(lastname)) {
                    tmp[k++] = phoneBook[i];
                }
            }
        }
        return Arrays.copyOf(tmp, k);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        int k = 0;
        Person[] tmp = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].getName().equals(name) && phoneBook[i].getLastname().equals(lastname)) {
                    tmp[k++] = phoneBook[i];
                }
            }
        }
        return Arrays.copyOf(tmp, k);
    }
}
