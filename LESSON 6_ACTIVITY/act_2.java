public class act_2 {
    public static void main(String[] args) {
        String[] students = {"Mary", "Gin", "Cjay"};
        double[][] grades = {
            {85.5, 90.0, 92.5}, // Grades for Mary
            {88.0, 91.5, 93.0}, // Grades for Gin
            {82.5, 87.0, 89.5}  // Grades for Cjay
        };
        String[] gradeTypes = {"-> Prelim", "-> Midterm", "-> Final"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "'s grades:");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println( gradeTypes[j] + " grade: " + grades[i][j]);
            }
            double average = (grades[i][0] + grades[i][1] + grades[i][2]) / 3;
            System.out.println("Average grade: " + String.format("%.1f", average));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(); 
        }
    }
}


