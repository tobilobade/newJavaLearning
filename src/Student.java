import java.util.HashMap;
import java.util.Map;


public class Student {
        private String name;
        private String id;
        private String course;


        //HERE WE ARE GOING TO SET THE NAME,ID AND COURSE
        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setCourse(String course) {
            this.course = course;
        }


        //HERE WE ARE GOING TO GET THE NAME,ID AND COURSE
        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getCourse() {
            return course;
        }

    @Override
    public String toString() {
        return
                "[name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", course='" + course + '\'' +
                ']';

    }

    public static void main(String[] args) {
            Map<Integer, Student> studentMap = new HashMap<>();

            // Creating and setting information of five students
            Student student1 = new Student();
            student1.setName("Tuyo");
            student1.setId("A123");
            student1.setCourse("Computer Science");
            studentMap.put(1, student1);

            Student student2 = new Student();
            student2.setName("Damilola");
            student2.setId("B456");
            student2.setCourse("Mathematics");
            studentMap.put(2, student2);

            Student student3 = new Student();
            student3.setName("Ommy");
            student3.setId("C789");
            student3.setCourse("Physics");
            studentMap.put(3, student3);

            Student student4 = new Student();
            student4.setName("Rose");
            student4.setId("D012");
            student4.setCourse("English Literature");
            studentMap.put(4, student4);

            Student student5 = new Student();
            student5.setName("Ife");
            student5.setId("E345");
            student5.setCourse("History");
            studentMap.put(5, student5);

            // Retrieving information of a specific student
            int studentId = 4;
            Student student = studentMap.get(studentId);


            System.out.println(studentMap);












//            if (student != null) {
//                System.out.println("Name: " + student.getName());
//                System.out.println("ID: " + student.getId());
//                System.out.println("Course: " + student.getCourse());
//            } else {
//                System.out.println("Student with ID " + studentId + " not found.");
//            }
        }
    }




