package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class ZipperTest {

    Zipper zipper;

    @BeforeEach
    void setUp() {
        zipper = new Zipper();
    }

    @Test
    void itWorks() {
        assertEquals(true, true);
    }

    @Test
    void testZipWithSameSizedLists() {
        List<Integer> listOne = List.of(1, 3, 5);
        List<Integer> listTwo = List.of(2, 4, 6);
        
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithFirstListLarger() {
        List<Integer> listOne = List.of(1, 3, 5, 7);
        List<Integer> listTwo = List.of(2, 4);
        
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 7);
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithSecondListLarger() {
        List<Integer> listOne = List.of(1, 3);
        List<Integer> listTwo = List.of(2, 4, 6, 8);
        
        List<Integer> expected = List.of(1, 2, 3, 4, 6, 8);
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithEmptyFirstList() {
        List<Integer> listOne = List.of();
        List<Integer> listTwo = List.of(2, 4, 6);
        
        List<Integer> expected = List.of(2, 4, 6);
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithEmptySecondList() {
        List<Integer> listOne = List.of(1, 3, 5);
        List<Integer> listTwo = List.of();
        
        List<Integer> expected = List.of(1, 3, 5);
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithBothEmptyLists() {
        List<Integer> listOne = List.of();
        List<Integer> listTwo = List.of();
        
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }

    @Test
    void testZipWithStrings() {
        List<String> listOne = List.of("Red", "Green", "Blue");
        List<String> listTwo = List.of("White", "Black");
        
        List<String> expected = List.of("Red", "White", "Green", "Black", "Blue");
        List<String> actual = Zipper.zip(listOne, listTwo);
        
        assertEquals(expected, actual);
    }
}
