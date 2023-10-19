package com.laurartt02.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharsTest {

    @Test
    void duplicateChars() {
        assertArrayEquals(new char[]{'e', 'l', 'w'}, DuplicateChars.duplicateChars("whistleblower"));
        assertArrayEquals(new char[]{'s'}, DuplicateChars.duplicateChars("ss"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateChars("s"));
        assertArrayEquals(new char[]{}, DuplicateChars.duplicateChars(""));
    }
}