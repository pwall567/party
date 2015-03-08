/*
 * @(#) Party.java
 */

package net.pwall.party;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Party<NameType extends PartyName> {

    private NameType name;
    private Collection<Contact> contacts;
    private Collection<PartyRole> partyRoles;

    public Party() {
        name = null;
        contacts = new HashSet<>();
        partyRoles = new HashSet<>();
    }

    public NameType getName() {
        return name;
    }

    public String getDisplayName() {
        return name.getDisplayName();
    }

    public Collection<Contact> getContacts() {
        return Collections.unmodifiableCollection(contacts);
    }

    public Collection<PartyRole> getPartyRoles() {
        return Collections.unmodifiableCollection(partyRoles);
    }

    public void addPartyRole(PartyRole partyRole) {
        partyRoles.add(partyRole);
    }

    public void removePartyRole(PartyRole partyRole) {
        partyRoles.remove(partyRole);
    }

}
