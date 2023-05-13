package src.homework2;

public class Ex2_8 {
    int x = 10, y = 5;
    System.out.println("x="+x);
    System.out.println("y="+y);

    int tmp = x;
    x = y;
    y = tmp;
    System.out.println("x="+x);
    System.out.println("y="+y);
}
