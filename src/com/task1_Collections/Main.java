package com.task1_Collections;

public class Main {
    public static void main(String[] args) {
        CharList list = new CharList("acb123123");
        System.out.println("CharList is: " + list.toString());
        System.out.println("Index of '1' char is: " + list.indexOf('1'));
        System.out.println("Length of CharList is: " + list.length());
        System.out.println("Char on the second place is: " + list.charAt(2));
        System.out.println("Substring(from 3 to 5) of CharList is: " + list.subString(3, 5));
        System.out.println("CharList without duplicate symbols is: " + list.removeDuplicates());
        System.out.println("CharList without removed symbols('1', '2') is:" + list.removeAll('1').removeAll('2'));
        System.out.println("CharList without removed first symbol('1') is: " + list.removeFirst('1'));
        System.out.println("CharList contains symbol 'q': " + list.contains('q'));
        System.out.println("CharList contains symbol 'a': " + list.contains('a'));
        System.out.println("CharList is empty: " + list.isEmpty());
        System.out.println("Sorted CharList: " + list.sortList());
        System.out.println("Reversed CharList: " + list.reverseList());
        System.out.println("Mixed CharList: " + list.mixedList());
        System.out.println("ToLowerCase: " + list.toLowerCase());
        System.out.println("ToUpperCase: " + list.toUpperCase());
        System.out.println("Cleared CharList: " + list.clearList());
        System.out.println("CharList is: " + list.toString());
    }
}
