class Student{
    int marks;
    String name;
    int roll;

}


public class test3{

public static void main(String s[]){


Student s1 = new Student();
s1.name = "sanu";
s1.marks=82;
s1.roll=1;

Student s2 = new Student();
s2.name = "harish";
s2.marks= 73;
s2.roll=2;
Student s3 = new Student();
s3.name = "bhanu";
s3.marks= 72;
s3.roll=3;

// System.out.print(s1);

Student students[] = new Student[3];
students[0]=s1;
students[1]=s2;
students[2]=s3;

// for(int i=0;i<students.length;i++)
// {
//     System.out.print(students[i].name + " " + students[i].marks);
// }

// Enhanced For Loop

for(Student stud: students)
{
    System.out.print(stud.name + " :" + stud.marks);
}
}
}