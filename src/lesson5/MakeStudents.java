package lesson5;

public class MakeStudents {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("BillyBOB");
        s.setScore(1, 71);
        s.setScore(2, 59);
        s.setScore(3, 82);
        System.out.println("The average for " + s.getName() + " is " + s.getAverage());
        System.out.println("The top mark for " + s.getName() + " is " + s.getHighscore());
        System.out.println(s);  //runs toString automatically
        System.out.println("\n\n------------------------------\n");
        Student s2 = new Student("Cindy Lou", 75, 85, 70);
        System.out.println("The average for " + s2.getName() + " is " + s2.getAverage());
        System.out.println("The top mark for " + s2.getName() + " is " + s2.getHighscore());
        System.out.println(s2);  //runs toString automatically
        System.out.println("\n\n------------------------------\n");
        //Cindys sister MaryLou is registering too
        Student s3 = new Student(s2);
        s3.setName("Mary Lou");
        s3.setScore(1, 95);
        System.out.println("The average for " + s3.getName() + " is " + s3.getAverage());
        System.out.println("The top mark for " + s3.getName() + " is " + s3.getHighscore());
        System.out.println(s3);  //runs toString automatically
        System.out.println("s2 hs the name: "+s2.getName());
        System.out.println("    dfdsfd "+s2.getScore(1));
    }

}
