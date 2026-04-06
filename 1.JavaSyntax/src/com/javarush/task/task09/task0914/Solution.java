package com.javarush.task.task09.task0914;

/* 
Группа перехвата исключений
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    }

    public static void method1() throws Exception1, Exception2, Exception3 {

    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
