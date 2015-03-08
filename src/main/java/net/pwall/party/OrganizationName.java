/*
 * @(#) OrganizationName.java
 */

package net.pwall.party;

public class OrganizationName extends PartyName {

    private String name;

    public OrganizationName(String name) {
        this.name = name;
    }

    @Override
    public String getDisplayName() {
        return name;
    }

}
