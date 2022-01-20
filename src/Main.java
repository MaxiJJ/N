import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String delimiter = "____________";
    private static List<String> notes = new ArrayList<>();


    public static void main(String[] args) {
        int operation = -1;

        while(operation != 0) {
            operation = menuView();

            switch(operation) {

                case 0:
                    break;

                case 1:
                    addNote();
                    break;

                case 2:
                    showNotes();
                    break;

                case 3:
                    removeNotes();
                    break;
                default:
                    System.out.println("Enter a valid operation");

            }
        }

    }

    public static int menuView() {
        Scanner scr = new Scanner(System.in);
        System.out.println(delimiter);
        System.out.println("Menu");
        System.out.println(delimiter);
        System.out.println("0 - Exit program");
        System.out.println("1 - Add note");
        System.out.println("2 - Show notes");
        System.out.println("3 - Remove note");
        System.out.println();
        System.out.println("Enter choice");

        int choice = scr.nextInt();
        return choice;
    }

    public static void addNote() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Add note");
        System.out.println(delimiter);
        System.out.println("Enter a note");

        String note = scr.nextLine();
        notes.add(note);
        showNotes();
    }

    public static void showNotes() {
        System.out.println("My notes");
        System.out.println(delimiter);

        int current = 1;

        for(String str : notes) {
            System.out.println(current++ + " " + str);
        }
        System.out.println(delimiter);
    }

    public static void removeNotes() {
        System.out.println("Remove Note");
        System.out.println(delimiter);
        Scanner scr = new Scanner(System.in);
        System.out.println("What do you want remove?");
        int index = scr.nextInt();
        if((index-1) < 0 || index > notes.size()) {
            System.out.println("Enter 1 of " + notes.size());
        } else {
            notes.remove(index-1);
        }
        System.out.println(delimiter);
        showNotes();
    }


}
