public class Main {

    int x;
    int y;
    public static void main(String[] args) {
        System.out.println(problemOne(8,12));
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

}