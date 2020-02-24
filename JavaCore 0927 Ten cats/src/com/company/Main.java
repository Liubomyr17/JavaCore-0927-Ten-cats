package com.company;

/*

0927 Ten cats
There is a cat class - Cat, with the "name" (String) field.
Create a Map <String, Cat> dictionary and add 10 cats there in the form “Name” - “Cat”.
Get from Map a set of all cats and display it on the screen.
Requirements:
1. The program should not read data from the keyboard.
2. The createMap method must declare and initialize a variable of type HashMap.
3. The createMap method should add 10 cats to the dictionary in the form “Name” - “Cat”.
4. The createMap method should return the created dictionary.
5. The convertMapToSet method should create and return many cats obtained from the transferred dictionary.
6. The program should display all the cats from the set on the screen.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
        public static void main(String[] args) {
            Map<String, Cat> map = createMap();
            Set<Cat> set = convertMapToSet(map);
            printCatSet(set);
        }

        public static Map<String, Cat> createMap()  {
            HashMap<String, Cat> map = new HashMap<>();

            for (int i = 0; i < 10; i++) {
                map.put("Cat"+i, new Cat("Cat" + i));
            }

            return map;
        }

        public static Set<Cat> convertMapToSet(Map<String, Cat> map)  {
            HashSet<Cat> set = new HashSet<>(map.values());

            return set;
        }

        public static void printCatSet(Set<Cat> set)
        {
            for (Cat cat:set)
            {
                System.out.println(cat);
            }
        }

        public static class Cat {
            private String name;

            public Cat(String name) {
                this.name = name;
            }

            public String toString() {
                return "Cat " + this.name;
            }
        }
    }







