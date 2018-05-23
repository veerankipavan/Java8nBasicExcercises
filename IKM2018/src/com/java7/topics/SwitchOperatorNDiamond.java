package com.java7.topics;

import com.ikm.Person;
import java.util.List;
import java.util.*;

public class SwitchOperatorNDiamond {

    public static void main(String args[]) {
        //Prior Java 7
        //Map<String, List<Person>> trades = new TreeMap<String, List<Person>> ();
        //From java 7
        Map<String, List<Person>> trades = new TreeMap<> ();
    }

    public void processTrade(Person t) {

        String status = t.getFirstName();



        switch(status) {

            case "NEW":

            newTrade(t);

            break;

            case "EXECUTE":

            executeTrade(t);

            break;

            case "PENDING":

            pendingTrade(t);

            break;



            default:

                break;

        }

    }

    private void newTrade(Person t) {
    }
    private void executeTrade(Person t) {
    }
    private void pendingTrade(Person t) {
    }
}
