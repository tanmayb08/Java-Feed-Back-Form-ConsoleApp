import java.util.*;
import java.io.*;

public class FeedBackForm {
    public static String ch = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeedBackForm f = new FeedBackForm();
        System.out.println("********Feed Back Form********\n");
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your class : ");
        String cls = sc.nextLine();

        System.out.println("\n***JPR***\n");
        f.Menu();
        int JPR = sc.nextInt();

        System.out.println("\n***GAD***\n");
        f.Menu();
        int GAD = sc.nextInt();

        System.out.println("\n***MIC***\n");
        f.Menu();
        int MIC = sc.nextInt();

        System.out.println("\n***DCC***\n");
        f.Menu();
        int DCC = sc.nextInt();

        System.out.println("\n***SEN***\n");
        f.Menu();
        int SEN = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("FeedBackRecord.txt");
            fw.write("Name : " + name);
            fw.write("\nClass : " + cls);

            fw.write("\nJPR : ");
            f.Choice(JPR);
            fw.write(ch + "\n");

            fw.write("GAD : ");
            f.Choice(GAD);
            fw.write(ch + "\n");

            fw.write("MIC : ");
            f.Choice(MIC);
            fw.write(ch + "\n");

            fw.write("DCC : ");
            f.Choice(DCC);
            fw.write(ch + "\n");

            fw.write("SEN : ");
            f.Choice(SEN);
            fw.write(ch + "\n");

            System.out.println("Record Submitted Successfully...");

            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();

    }

    public void Menu() {
        System.out.println("5.Exllent");
        System.out.println("4.Very Good");
        System.out.println("3.Good");
        System.out.println("2.Satisfactory");
        System.out.println("1.Poor");
        System.out.println("Enter your choice : ");
    }

    public void Choice(int a) {
        switch (a) {
            case 1:
                ch = "Poor";
                break;
            case 2:
                ch = "Satisfactory";
                break;
            case 3:
                ch = "Good";
                break;
            case 4:
                ch = "Very Good";
                break;
            case 5:
                ch = "Exllent";
                break;
            default:
                ch = "Invalid Input";
                break;
        }

    }

}
