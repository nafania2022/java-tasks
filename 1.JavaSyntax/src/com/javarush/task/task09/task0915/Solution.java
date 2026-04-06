package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {

    }

    public static void processExceptions() throws FileSystemException {

    }

    public static class StatelessBean {
        public void log(Exception exception) {

        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {

        }
    }
}
