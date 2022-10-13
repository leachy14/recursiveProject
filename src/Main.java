public class Main {

    int x;
    int y;
    public static void main(String[] args) {
        //problem one
        System.out.println(problemOne(8,12));
        //problem two
        System.out.println(problemTwo(problemTwo(problemTwo(problemTwo(problemTwo(10))))));

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
}