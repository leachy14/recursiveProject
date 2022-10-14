import java.lang.Math;
public class Main {

    int x;
    int y;
    public static void main(String[] args) {
        //problem one
        System.out.println("Problem one: " + problemOne(8,12));
        //problem two
        System.out.println("Problem two: " + problemTwo(problemTwo(problemTwo(problemTwo(problemTwo(10))))));
        //problem three
        System.out.println("Problem three: " + problemThree(30,12));
        //problem four
        System.out.println("Problem four: " + problemFour(32));
        //problem five
        System.out.println("Problem five: " + problemFive(5));
        //probelm six
        System.out.println("Problem six: " + problemSix(35,8));
        //problem seven
        System.out.println("Problem seven: " + loopForSeven());
        //problem eight
        System.out.println("Problem eight: " + problemEight(problemEight(problemEight(problemEight(18)))));
    }

    //recursive method 1
    public static int problemOne(int x, int y) {
        if (x < y) {
            return problemOne(x + 1, y - 2) + 3;
        } else if (x > y) {
            return problemOne(y - 1, x) - 1;
        } else {
            return x * x + y * y;
        }

    } //end problemOne

    //recursive method 2
    public static int problemTwo(int x) {
        if (x > 7) {
            return problemTwo(x - 5) - 3;
        } else if (x > 3 && x < 7) {
            return problemTwo(x + 2) + 2;
        } else {
            return x + 5;
        }
    } // end problemTwo

    // problem three
    public static int problemThree(int x, int y) {
        if (x > y) {
            return Math.max(problemThree(x - 4, y + 3), problemThree(y,x));
            } else {
            return x * y;
        }
    } // end problemThree

    public static int problemFour(int x) {
        if ((x % 2) == 0) {
            return problemFour((x/2) - 1) + 3;
        } else if (x > 0) {
            return 2 * problemFour(x - 3) - 5;
        } else {
            return (x * x) - 3;
        }
    } // end problemFour

    //problem five
    public static int problemFive(int x) {
        if (x == 1) {
            return 8;
        } else {
            return (2 * problemFive(x - 1)) - 4;
        }
    } // end problem 5

    //problem six
    public static int problemSix(int x, int y) {
        if (x >= y) {
            return problemSix(x - y, y + 2);
        } else {
            return (x * x) - y;
        }
    }

    //problem seven
    public static int problemSeven(int x) {
        if (x == 1) {
            return 1;
        } else {
            return problemSeven(x - 1) + 5;
        }
    }

    public static int loopForSeven() {
        int sum = 0;
        for (int i = 10; i >= 1; i--) {
            sum += problemSeven(i);
        }
        return sum;
    }

    //problem eight
    public static int problemEight(int x) {
        if (x >= 10) {
            return problemEight(x - 5) - 2;
        } else if(7 <= x && x < 10){
            return problemEight(x + 4) + 6;
        } else {
            return x - 4;
        }
    }

} //end main