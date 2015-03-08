/*
 * @(#) PartyRole.java
 */

package net.pwall.party;

public abstract class PartyRole {

    private Party<?> party;

    public Party<?> getParty() {
        return party;
    }

    public PartyName getPartyName() {
        return getParty().getName();
    }

}
