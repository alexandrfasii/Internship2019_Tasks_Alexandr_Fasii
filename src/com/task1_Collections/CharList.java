package com.task1_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class CharList {
    ArrayList<Character> value;

    public CharList() {
        value = new ArrayList<>();
    }

    public CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        value = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            value.add(chars[i]);
        }
    }

    public CharList(ArrayList<Character> list) { //ispravit' //?
        this.value = list;
    }

    public ArrayList<Character> getValue() {
        return value;
    }

    public void setValue(ArrayList<Character> value) {
        this.value = value;
    }


    @Override
    public String toString() {
        String s = value.toString();
        return s;
    }

    public int length() {
        return value.size();
    }

    public int indexOf(char c) {  // index of the first occurrence.
        return value.indexOf(c);
    }

    public ArrayList<Integer> indexesOf(char c) { // indexes of the all occurrences.
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i <value.size(); i++) {
            if (value.get(i).equals(c)) {
                list.add(i);
            }
        }
        return list;
    }


    public char charAt(int index) {
        return value.get(index);
    }


    public CharList subString(int begin, int end) {
        return new CharList(new ArrayList<Character>(value.subList(begin, end)));
    }


    public CharList removeAll(char c) {
        value.removeAll(Collections.singleton(c));
        return this;
    }

    public CharList removeDuplicates() {
        List<Character> listWithoutDuplicates = value.stream().distinct().collect(Collectors.toList());
        this.value = new ArrayList<Character>(listWithoutDuplicates);
        return this;
    }

    public CharList removeFirst(Character c) {
        value.remove(c);
        return this;
    }

    public boolean isEmpty(){
        return value.isEmpty();
    }

    public boolean contains(Character c) {
        return value.contains(c);
    }

    public CharList clearList() {
        value.clear();
        return this;
    }

    public CharList sortList() {
        Collections.sort(value);
        return this;
    }

    CharList reverseList() {
        Collections.reverse(value);
        return this;
    }

    CharList mixedList() {
        Collections.shuffle(value);
        return this;
    }


//Optional

    public CharList toLowerCase() {
        UnaryOperator<Character> operator = ((x) -> Character.toLowerCase(x));
        value.replaceAll(operator);
        return this;
    }

    public CharList toUpperCase() {
        UnaryOperator<Character> operator = ((x) -> Character.toUpperCase(x));
        value.replaceAll(operator);
        return this;
    }
}


/*
    Implement CharList class (like String using ArrayList as value).
        Don`t use String objects in CharList class.
All methods excluding constructors and toString should be implemented without "for" expression.
Look at Collections, Lists methods and use them at maximum.
Implement:
+CharList()
+CharList(String s)
+private CharList(ArrayList<Character> list) - it will help you to implement other methods
method done:
+String toString()
+int length() - returns CharList length
+char charAt(int index) - returns char value for the particular index
+int indexOf(char c) - returns the specified char value index.
+CharList subString(int start, int end) - returns substring for given begin index.
+CharList removeDuplicates() - remove duplicates symbols using collections.
+CharList removeAll(Character c) - remove all occurrences of the specified char value.
+CharList removeFirst(Character c) - remove first occurrences of the specified char value.
+boolean isEmpty() - returns true if CharList is empty
+boolean contains(Character c) - returns true is CharList contains the specified char value
+CharList clearList() - returns cleared CharList
+CharList sortList() - returns sorted CharList
+CharList reverseList() - returns reversed CharList
+CharList mixedList() - returns CharList with mixed elements



Additional(optional) methods(you can implement them however you want):
+CharList toLowerCase - returns a CharList in lowercase.
+CharList toUpperCase - returns a CharList in uppercase.




Test data:
CharList is: acb123123
Index of '1' char is: 3
Length of CharList is: 9
Char on the second place is: b
Substring(from 3 to 5) of CharList is: 12
CharList without duplicate symbols is: a1b2c3
CharList without removed symbols('1', '2') is: acb33
CharList without removed first symbol('1') is: acb23123
CharList contains symbol 'q': false
CharList contains symbol 'a': true
Cleared CharList:
CharList is empty: true
Sorted CharList: 112233abc
Reversed CharList: 321321bca
Mixed CharList: 1a322b13c*/
