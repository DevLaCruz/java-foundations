package arrays;
import java.util.Scanner;

public class StudentNotesArrayExample {
    public static void main(String[] args) {

        double[] mathCourse, historyCourse, languageCourse;
        double sumMathNotes = 0, sumHistoryNotes = 0, sumLanguageNotes = 0;
        mathCourse = new double[7];
        historyCourse = new double[7];
        languageCourse = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Type a 7 notes for math:");
        for(int i = 0; i < mathCourse.length; i++){
            mathCourse[i] = s.nextDouble();
        }

        System.out.println("Type a 7 notes for history:");
        for(int i = 0; i < historyCourse.length; i++){
            historyCourse[i] = s.nextDouble();
        }

        System.out.println("Type a 7 notes for language:");
        for(int i  = 0; i < languageCourse.length; i++){
            languageCourse[i] = s.nextDouble();
        }

        for(int i = 0; i < 7; i++){
            sumMathNotes += mathCourse[i];
            sumHistoryNotes += historyCourse[i];
            sumLanguageNotes += languageCourse[i];
        }

        double mathAverage = (sumMathNotes/mathCourse.length);
        double historyAverage = (sumHistoryNotes/historyCourse.length);
        double languageAverage = (sumLanguageNotes/languageCourse.length);
        System.out.println("average math course: " + mathAverage);
        System.out.println("average history course: " + historyAverage);
        System.out.println("average language course: " + languageAverage);
        System.out.println("total average: "
                + (mathAverage + historyAverage + languageAverage)/3);

        System.out.println("Type a student identifier (from 0 - 6):");
        int id = s.nextInt();
        double studentAverage = (historyCourse[id] + languageCourse[id] + mathCourse[id])/3;
        System.out.println("Student's Average Nro " + id + " : " + studentAverage);
    }
}
