package com.basic.lambda.prepexercises;

import java.awt.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanneauCalcul extends JPanel {

    private HashMap<String, JButton> listbouton = new HashMap<String, JButton>() ;
    public PanneauCalcul() {
        for(int i = 0; i < 10; i ++) {
            listbouton.put("num" + i, new JButton("" + i)) ;
        }

        listbouton.put("add", new JButton("+")) ;
        listbouton.put("soustract", new JButton("-")) ;
        listbouton.put("multiply", new JButton("x")) ;
        listbouton.put("divise", new JButton("/")) ;
        listbouton.put("equal", new JButton("=")) ;

        Set entrys = listbouton.entrySet() ;

        Iterator iter = entrys.iterator() ;

        while(iter.hasNext()) {
            Map.Entry me = (Map.Entry)iter.next();  //don't understand
            this.add((Component) me.getValue()) ;   //don't understand
        }


    }
}
