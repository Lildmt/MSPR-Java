package fr.epsi.javapp;
import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception
    {
        File doc = new File("C:\\Users\\tasoe\\Desktop\\doc.txt");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine())System.out.println(obj.nextLine());
    }
}