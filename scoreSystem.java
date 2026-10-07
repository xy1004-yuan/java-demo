import java.util.*;
class Students{
String name;
double score;
public Students(String name,double score) {
    this.name = name;
    this.score = score;
}

}

public class scoreSystem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        while(true){
            System.out.println("====学生成绩管理系统====");
            System.out.println("1.录入成绩");
            System.out.println("2.显示全部");
            System.out.println("3.按分数排序");
            System.out.println("4.退出");
            System.out.print("请输入选项");
            try{
                int choose = in.nextInt();
                in.nextLine();
                if(choose == 1) {
                    System.out.println("请输入学生名字");
                    String name = in.nextLine();
                    System.out.println("请输入学生成绩");
                    double score = in.nextInt();
                    in.nextLine();
                    Student s = new Student(name, score);
                    studentList.add(s);
                    System.out.println("录入成功");
                }else if(choose ==2) {
                    System.out.println("\n====全部学生信息====");
                    if (studentList.size() == 0) {
                        System.out.println("暂无学生凭据");
                    } else {
                        for (Student stu : studentList) {
                            System.out.println("姓名：" + stu.name + "分数" + stu.score);

                        }
                    }
                }else if(choose ==3){
                    Collections.sort(studentList, (a,b)->
                    Double.compare(b.score,a.score));
System.out.println("\n排序完成 (从高到低）");
                }else if(choose ==4) {
                    System.out.println("程序退出");
                    break;
                }else {
                    System.out.println("请输入1-4之间的数字1");
                }
            }catch(InputMismatchException e){
                System.out.println("请输入数字！");
                in.nextLine();

                }
            }
            in.close();





    }
}
