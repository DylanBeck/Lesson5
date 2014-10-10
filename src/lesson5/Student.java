package lesson5;
public class Student {

    //instance variables
    private String name;
    private int test1, test2, test3;

    //constructor
    //this code initializes an object by setting the properties
    //this code runs whenever ypu type 'new' in another class
    public Student() {
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
        
    }
    //contructor allows us to make a student with data
    public Student(String n, int t1, int t2, int t3)
    {
        name=n;
        test1 = t1;
        test2 = t2;
        test3 = t3;
               
              
    }
    //this constructor allows us to clone an existing student
    public Student(Student other)
    {
        name = other.name;
        test1 = other.test1;
        test2 = other.test2;
        test3 = other.test3;
    }
    //instance methods
    //these define the students abilities
    //because name is private we need methods to gain access

    public void setName(String aname) {
        name = aname;
    }

    public String getName() {
        return name;
    }
    //all setter methods are ususally void and need a parameter
    //their job is to set a propert of your object
    //all getter methods are not void and dont need a parameter
    //they are set to the type of data being returned
    //becuase name is a string, getName is public String 

    public void setScore(int test, int score) {
        if (test == 1) {
            test1 = score;
        } else if (test == 2) {
            test2 = score;
        } else {
            test3 = score;
        }

    }

    public int getScore(int whichone) {
        if (whichone == 1) {
            return test1;
        } else if (whichone == 2) {
            return test2;
        } else {
            return test3;
        }
    }

    public int getAverage() {
        return (test1 + test2 + test3) / 3;
    }

    public int getHighscore() {
        int result = test1;
        if (test2 > result) {
            result = test2;
        }
        if (test3 > result) {
            result = test3;
        }
        return result;
    }

    public String toString() {
        String result;
        result = "Name:\t" + name;
        result += "\nTest 1 :\t" + test1;
        result += "\nTest 2 :\t" + test2;
        result += "\nTest 3 :\t" + test3;
        result += "\n---------------\n";
        result += "Average: \t" + getAverage();
        return result;
    }

}
