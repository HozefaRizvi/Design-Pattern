/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Itterator_Pattern;

/**
 *
 * @author TechEnclave Computer
 */
import java.util.ArrayList;

class NameRepository implements Container 
{
    public Student students[] = 
    {
        new Student("001", "Muhammad", "Male", "123-456-7890"),
        new Student("002", "Asad", "Male", "987-654-3210"),
        new Student("003", "Dua", "Female", "555-555-5555"),
        new Student("004", "Aqsa", "Female", "777-777-7777")
    };

    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index;

        public NameIterator() 
        {
            index = students.length - 1; // Start at the last student
        }

        @Override
        public boolean hasNext()
        {
            return index >= 0;
        }

        @Override
        public Object next() 
        {
            if (this.hasNext()) 
            {
                return students[index--];
            }
            return null;
        }

        public Object previous()
        {
            if (index < students.length - 1)
            {
                return students[++index];
            }
            return null;
        }

        public void moveToFirst() 
        {
            index = students.length - 1;
        }

        public void moveToLast() 
        {
            index = 0;
        }
    }
}

class Student
{
    String regNo;
    String name;
    String gender;
    String phoneNumber;

    public Student(String regNo, String name, String gender, String phoneNumber) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Getters for the attributes

    public String getName() {
        return name;
    }
}