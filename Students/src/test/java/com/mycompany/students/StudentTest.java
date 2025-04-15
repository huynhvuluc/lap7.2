/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.students;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    @Test
    public void testGetName() {
        Student s = new Student("S01", "John", 20);
        assertEquals(s.getName(), "John");
    }

    @Test
    public void testSetAge() {
        Student s = new Student("S02", "Anna", 19);
        s.setAge(21);
        assertEquals(s.getAge(), 21);
    }

    @Test
    public void testUpdateName() {
        Student s = new Student("S03", "Mike", 22);
        s.updateName("Michael");
        assertEquals(s.getName(), "Michael");
    }
}