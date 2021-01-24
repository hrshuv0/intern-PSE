import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);

        Course[] courseList = new Course[5];
        Routine[][] routine = new Routine[5][4];

        courseList[0] = new Course("English Grammar","John Smith");
        courseList[1] = new Course("Mathematics","Lara Gilbert");
        courseList[2] = new Course("Physics","Johanna Kabir");
        courseList[3] = new Course("Chemistry","Danniel Robertson");
        courseList[4] = new Course("Biology","Larry Cooper");

        char ch;

        while(true)
        {
            System.out.println("A. Create Routine");
            System.out.println("B. Show Routine");
            System.out.println("C. List Courses with Teachers Name");
            System.out.println();
            ch = scan.next().charAt(0);

            switch (ch)
            {
                case 'A':
                    for(int i = 0; i < 5; i++)
                    {
                        System.out.println(i+1 + ": " + courseList[i].getCourseName());
                    }
                    for (int j = 0; j < 5; j++) {
                        for (int i = 0; i < 4; i++) {
                            routine[j][i] = new Routine(i);
                            int a;
                            System.out.print(j+" "+i+ " ");
                            a = scan.nextInt();
                            routine[j][i].setCourseName(courseList[a].getCourseName());
                        }
                        System.out.println();
                    }
                    break;
                case 'B':
                    for (int j = 0; j < 5; j++) {
                        for (int i = 0; i < 4; i++) {
                            System.out.println(j+" "+routine[j][i].getHourIndex()+ " "+routine[j][i].getCourseName());
                        }
                        System.out.println();
                    }
                    break;
                case 'C':
                    for (Course c:courseList
                    ) {
                        System.out.println(c.getCourseName()+", " + c.getTeacherName());
                    }
                    System.out.println();
                    break;
                default:
                    return;
            }
        }
    }
}

