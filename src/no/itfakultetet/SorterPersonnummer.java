package no.itfakultetet;

import java.time.LocalDate;
import java.util.Comparator;

public class SorterPersonnummer implements Comparator {

    @Override
    public int compare(Person p1, Person p2) {


        Integer i1 = Integer.getInteger(p1.getPersonnummer().substring(4,6)+
                        p1.getPersonnummer().substring(2,4) +
                        p1.getPersonnummer().substring(0,2)
                );

        Integer i2 = Integer.getInteger(p2.getPersonnummer().substring(4,6)+
                p2.getPersonnummer().substring(2,4) +
                p2.getPersonnummer().substring(0,2)
        );



        return  i1-i2;
    }
}
