package com.syntax.class30;

import java.util.HashMap;

//Create a map of a building. Store floor number and it is associated company name.
// (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

public class Task1 {

        public static void main(String[] args) {

            HashMap<Integer,String> bldgMap=new HashMap<>();

            bldgMap.put(1, "Microsoft");
            bldgMap.put(2, "Samsung");
            bldgMap.put(3, "Google");
            bldgMap.put(3, "Dell");
            bldgMap.put(4, "HP");
            bldgMap.put(5, "Syntax");
            bldgMap.put(7, "Dell");

            System.out.println(bldgMap.entrySet().size());   //Check how many entries you have


            bldgMap.replace(4, "Mazda");                        //Update company on a 4th floor

            System.out.println(bldgMap);


            bldgMap.remove(7, "Dell");                      //Remove company on the 7th floor
                System.out.println(bldgMap.entrySet());

            System.out.println(bldgMap);


        }
    }



