package com.task1_Collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

public class CharListTest {

    @Test
    public void testConctructor() {
        CharList charlist = new CharList("abc");
        String s = charlist.toString();
        System.out.println(s);
        assertEquals("abc", s);
    }

    @Test
    public void testToString() {
        CharList charlist = new CharList("abc");
        String actualValue = charlist.toString();
        assertEquals("abc", actualValue);
    }

    @Test
    public void testLenght() {
        CharList charlist = new CharList("abc");
        int actualValue = charlist.length();
        assertEquals(3, actualValue);
    }

    @Test
    public void testIndexOf() {
        CharList charlist = new CharList("abc123123");
        int actualValue = charlist.indexOf('1');
        assertEquals(3, actualValue);
    }

    @Test
    public void testIndexesOf() {
        CharList charlist = new CharList("abcabcabc");
        ArrayList<Integer> actualValue = charlist.indexesOf('a');
        assertEquals(actualValue, actualValue.toString());
    }

    @Test
    public void testCharAt() {
        CharList charlist = new CharList("abc123123");
        char actualValue = charlist.charAt(1);
        assertEquals('b', actualValue);
        System.out.println("Char on the second place is: " + actualValue);
    }

    @Test
    public void testSubString(){
        CharList charlist = new CharList("fasii");
        CharList subList = charlist.subString(2, 4);
        assertEquals("si", subList.toString());
    }

    @Test
    public void testRemoveAll() {
        CharList charlist = new CharList("fasii");
        CharList actualValue = charlist.removeAll('i');
        assertEquals("fas", actualValue.toString());
        System.out.println(actualValue);
    }

    @Test
    public void testRemoveDuplicates(){
        CharList charlist = new CharList("abcabc");
        CharList actualValue = charlist.removeDuplicates();
        assertEquals("abc", actualValue.toString());
    }

    @Test
    public void testRemoveFirst() {
        CharList charlist = new CharList("abcabc");
        CharList actualValue = charlist.removeFirst('c');
        assertEquals("ababc", actualValue.toString());
    }

    @Test
    public void testIsEmpty() {
        CharList charlist = new CharList("abc");
        boolean actualValue = charlist.isEmpty();
        assertEquals(false, actualValue);
    }

    @Test
    public void testContains() {
        CharList charlist = new CharList("abc");
        boolean actualValue = charlist.contains('c');
        assertEquals(true, actualValue);
    }

    @Test
    public void testClearList() {
        CharList charlist = new CharList("abcde");
        CharList actualValue = charlist.clearList();
        assertEquals("", actualValue.toString());
    }

    @Test
    public void testSortList() {
        CharList charlist = new CharList("cba321");
        CharList actualValue = charlist.sortList();
        System.out.println(actualValue.toString());
        assertEquals("123abc", actualValue.toString());
    }

    @Test
    public void testReversetList() {
        CharList charlist = new CharList("abcde");
        CharList actualValue = charlist.reverseList();
        assertEquals("edcba", actualValue.toString());
    }

    @Test
    public void testMixedtList() {
        CharList charlist = new CharList("abcde");
        CharList actualValue = charlist.mixedList();
        assertEquals(actualValue.toString(), actualValue.toString());
    }

    @Test
    public void testToLowerCase() {
        CharList charlist = new CharList("ABabcXYc");
        CharList newCharlist = charlist.toLowerCase();
        assertEquals("ABabcXYc", charlist.toString());
        assertEquals("ababcxyc", newCharlist.toString());
    }

    @Test
    public void testToUpperCase() {
        CharList charlist = new CharList("abcde");
        CharList newCharlist = charlist.toUpperCase();
        assertEquals("abcde", charlist.toString());
        assertEquals("ABCDE", newCharlist.toString());
    }
}
