import java.util.ArrayList;
import java.util.List;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        final char FINAL_GRADE = calculateFinalGrade(createGradesList());
        System.out.println("Your grade for this semester of CS 222 is: " + FINAL_GRADE);
    }

    private static char calculateEngagement(int DAYS_ATTENDED)
    {
        if(DAYS_ATTENDED >=24)
        {
            return 'A';
        }
        else if(DAYS_ATTENDED >= 22)
        {
            return 'B';
        }
        else if (DAYS_ATTENDED >=20)
        {
            return 'C';
        }
        else if(DAYS_ATTENDED >=18)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
    private static char calculateAssignments(int ASSIGNMENTS_COMPLETED)
    {
        if(ASSIGNMENTS_COMPLETED >=7)
        {
            return 'A';
        }
        else if(ASSIGNMENTS_COMPLETED >= 6)
        {
            return 'B';
        }
        else if (ASSIGNMENTS_COMPLETED >=5)
        {
            return 'C';
        }
        else if(ASSIGNMENTS_COMPLETED >=4)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
    private static char calculateAchievements(int ACHIEVEMENTS_COMPLETED)
    {
        if(ACHIEVEMENTS_COMPLETED >=6)
        {
            return 'A';
        }
        else if(ACHIEVEMENTS_COMPLETED >= 4)
        {
            return 'B';
        }
        else if (ACHIEVEMENTS_COMPLETED >=2)
        {
            return 'C';
        }
        else
        {
            return 'D';
        }
    }
    private static char calculateMSSAR(boolean MSSAR)
    {
        if(MSSAR)
        {
            return 'A';
        }
        else
        {
            return 'D';
        }

    }
    private static char calculateProject(char FIRST_ITERATION_PROJECT, char SECOND_ITERATION_PROJECT, char THIRD_ITERATION_PROJECT)
    {

        if(THIRD_ITERATION_PROJECT == 'A' && SECOND_ITERATION_PROJECT < 'D' && THIRD_ITERATION_PROJECT < 'D')
        {
            return 'A';
        }
        else if(THIRD_ITERATION_PROJECT == 'B')
        {
            return 'B';
        }
        else if (THIRD_ITERATION_PROJECT == 'C')
        {
            return 'C';
        }
        else if(THIRD_ITERATION_PROJECT == 'D')
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
    private static char calculateFinalExam(char FINAL_EXAM)
    {

        if(FINAL_EXAM == 'A' || FINAL_EXAM == 'B')
        {
            return 'A';
        }
        else if(FINAL_EXAM == 'C')
        {
            return 'C';
        }
        else
        {
            return 'D';
        }
    }
    private static List<Character> createGradesList()
    {
        List<Character> grades = new ArrayList<Character>();
        grades.add(calculateEngagement(25));
        grades.add(calculateAssignments(5));
        grades.add(calculateAchievements(2));
        grades.add(calculateMSSAR(true));
        grades.add(calculateProject('D','C', 'A'));
        grades.add(calculateFinalExam('A'));
        return grades;
    }
    private static char calculateFinalGrade(List<Character> grades)
    {
        char max_grade = 'A';
        for(Character character: grades)
        {
            if(character > max_grade)
            {
                max_grade = character;
            }
        }
        return max_grade;
    }
}