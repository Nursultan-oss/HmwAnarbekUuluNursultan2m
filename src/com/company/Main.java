package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        ArrayList < String> addColor = new ArrayList<>(3);
           addColor.add("Red");
            addColor.add("Green");
               addColor.add("Black");
                    addColor.ensureCapacity(6);
                        addColor.add("White");
                          addColor.add("Pink");
        System.out.println(addColor);
            Collections.sort(addColor, Collections.reverseOrder());
        System.out.println("Сортированный список в обратном порядке" + addColor);
        Collections.shuffle(addColor);
              System.out.println("Eto random" + addColor);
        }


    }

