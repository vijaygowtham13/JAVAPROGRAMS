//print hello in uppercase
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class uppercase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "helloworld";
        int start = 0;
        int end = 5;
        System.out.println(S.substring(start,end).toUpperCase());
        in.close();
    }
}