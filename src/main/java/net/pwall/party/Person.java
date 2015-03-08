/*
 * @(#) Person.java
 */

package net.pwall.party;

public class Person extends Party<PersonName> {

    public String getSurname() {
        return getName().getSurname();
    }

}
