package baitap;





import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DEMO {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        HANGHOA h = new HANGDIENMAY();
        h.input();
        HANGHOA h1 = new HANGSANHSU();
        h1.input();
        HANGHOA h2 = new HANGTHUCPHAM();
        h2.input();
    }
}