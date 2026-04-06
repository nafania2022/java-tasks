package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {

    }

    public static class Cat {
        private final String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {

        }

        Cat(String name, Cat mother) {

        }

        Cat(String name, Cat mother, Cat father) {

        }

        Cat(Cat father, String name) {

        }

        @Override
        public String toString() {
            return "";
        }
    }
}
