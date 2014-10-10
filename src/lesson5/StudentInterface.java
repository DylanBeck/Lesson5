package lesson5;

import TerminalIO.KeyboardReader;

public class StudentInterface {

    public static void main(String[] args) {
        //Instantiate the students and the keyboard object
        Student student1 = new Student();
        Student student2 = new Student();
        KeyboardReader reader = new KeyboardReader();

        String name;
        int score;

        //inport the first student's data
        name = reader.readLine("Enter the first Student's name: ");
        student1.setName(name);
        for (int i = 1; i <= 3; i++) {
            score = reader.readInt("Enter the student's name: ");
            student1.setScore(i, score);
        }

        //Input the second student's data
        name = reader.readLine("Enter the first student's name:  ");
        student2.setName(name);
        for (int i = 1; i <= 3; i++) {
            score = reader.readInt("Enter the student's score: ");
            student2.setScore(i, score);
        }
        //Output the two students' info
        System.out.println(student1);
        System.out.println(student2);
        
     
       
        //If(student1.getAverage()> student2.getAverage() ){
        //System.out.println(student1.getName()"");
    }
    }

