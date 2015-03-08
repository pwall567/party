/*
 * @(#) PersonName.java
 */

package net.pwall.party;

public class PersonName extends PartyName {

    private String surname;
    private String[] givenNames;
    private boolean surnameFirst;

    public PersonName(String surname, String[] givenNames, boolean surnameFirst) {
        this.surname = surname;
        this.givenNames = givenNames;
        this.surnameFirst = surnameFirst;
    }

    public PersonName(String surname, String[] givenNames) {
        this(surname, givenNames, false);
    }

    @Override
    public String getDisplayName() {
        StringBuilder sb = new StringBuilder();
        if (surnameFirst && surname != null)
            sb.append(surname);
        for (String givenName : givenNames) {
            if (sb.length() > 0)
                sb.append(' ');
            sb.append(givenName);
        }
        if (!surnameFirst && surname != null) {
            if (sb.length() > 0)
                sb.append(' ');
            sb.append(surname);
        }
        return sb.toString();
    }

    public String getSurname() {
        return surname;
    }

    public String[] getGivenNames() {
        return givenNames;
    }

}
