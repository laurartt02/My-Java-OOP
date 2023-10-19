package com.laurartt02.exercises.oop.phonebook;

/**
 * Interface representing a generic PhoneBook implementing classes must provide
 * methods for inserting, deleting and searching persons within the PhoneBook
 *
 * @author lauraratti
 */
public interface PhoneBook {

    /**
     * Adds a person to the phone book
     * @param p the person to be added to the phone book
     * @return true if the phone book has been modified
     */
    boolean addPerson(Person p);

    /**
     * Removes a person from the phone book
     * @param p the person to be removed from the phone book
     * @return true if the phone book has been modified
     */
    boolean removePerson(Person p);

    /**
     * Searches all persons with a specific surname
     * @param lastname The lastname to be searched
     * @return An array comprising all the persons found
     */
    Person[] searchByLastname(String lastname);

    /**
     * Searches all persons with a specific name and lastname
     * @param name The name to be searched
     * @param lastname The lastname to be searched
     * @return An array comprising all the persons found
     */
    Person[] searchByNameAndLastname(String name, String lastname);

}
