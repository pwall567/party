/*
 * @(#) Contact.java
 */

package net.pwall.party;

public abstract class Contact {

    private ContactType type; // business or personal

    public Contact(ContactType type) {
        this.type = type;
    }

    public ContactType getType() {
        return type;
    }

}
