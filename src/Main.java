import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher bob=new Teacher(1,"Bob",1500);
        Teacher liz=new Teacher(2,"Liz",1000);
        Teacher max=new Teacher(3,"Max",2000);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(bob);
        teacherList.add(liz);
        teacherList.add(max);

        Student tom=new Student(1,"Tom",4);
        Student maxim=new Student(2,"Maxim",3);
        Student rebeka=new Student(3,"Rebeka",5);

        List<Student> studentList=new ArrayList<>();
        studentList.add(tom);
        studentList.add(maxim);
        studentList.add(rebeka);

        School school=new School(teacherList,studentList);

        tom.PayFee(1000);
        maxim.PayFee(2000);
        rebeka.PayFee(3000);
        System.out.println("School has earned "+school.getTotalMoneyEarned());

        bob.receiveSalary(bob.getSalary());
        System.out.println("School has spent for salary to "+bob.getName()+
                "and now has "+school.getTotalMoneyEarned());

        liz.receiveSalary(liz.getSalary());
        System.out.println("School has spent for salary to "+liz.getName()+
                "and now has "+school.getTotalMoneyEarned());

        max.receiveSalary(max.getSalary());
        System.out.println("School has spent for salary to "+max.getName()+
                "and now has "+school.getTotalMoneyEarned());

        System.out.println(bob);

        System.out.println(liz);

        System.out.println(tom);

        System.out.println(rebeka);


    }
}
