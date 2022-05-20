package no.itfakultetet;

import java.util.Comparator;

public class Person implements Comparable  {

    private String personnummer;
    private String navn;

    public Person(String personnummer, String navn) {
        this.personnummer = personnummer;
        this.navn = navn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
