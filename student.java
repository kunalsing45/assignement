import java.util.Scanner;

// made by Bca student kundan panwar
class student {

    int rollno;
    String name, div;
    String subject[] = new String[5];
    int marks[] = new int[5];
    float result;

    student() {
        name = "empty";
        rollno = 0;
        div = "empty";
        subject[0] = "empty";
        subject[2] = "empty";
        subject[3] = "empty";
        subject[4] = "empty";
        marks[0] = 0;
        marks[1] = 0;
        marks[2] = 0;
        marks[3] = 0;
        marks[4] = 0;
        result = 0;

    }

    void inp_marks() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("(" + (i + 1) + ") subject name:");
            subject[i] = scan.next();
            System.out.println("marks obtain:");
            marks[i] = scan.nextInt();
        }
        scan.close();
        // percentage
        result = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5f;
        // division
        if (result >= 80) {
            div = "first";
        } else if (result >= 60 && result < 80) {
            div = "second";
        } else if (result >= 35 && result < 60) {
            div = "third";
        } else {
            div = "fail";
        }

    }

    void display() {
        System.out.println("rollno:" + rollno);
        System.out.println("Name:" + name);
        System.out.println("marks:-");
        for (int i = 0; i < 5; i++) {
            System.out.println(subject[i] + ":" + marks[i]);
        }
        System.out.println("percentage: " + result);
        System.out.println("division:" + div);

    }

    public static void main(String args[]) {
        student arr[] = new student[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("enter no. of students: ");
        int len = scan.nextInt();

        for (int i = 0; i < len; i++) {

            System.out.println("enter the data of (" + (i + 1) + ") student\n");

            student temp = new student();

            System.out.println("enter the roll no . : ");
            temp.rollno = scan.nextInt();

            System.out.println("enter the name: ");
            temp.name = scan.next();

            temp.inp_marks();

            arr[i] = temp;

        }
        scan.close();
        System.out.println("data stored :=\n");
        for (int j = 0; j < len; j++) {
            arr[j].display();
        }

    }

}
