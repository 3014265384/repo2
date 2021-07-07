package Dames;
import java.util.Scanner;
/**
 * 领养宠物
 * 示例三
 */

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎来到我的宠物店！");
        //1.输入宠物名称
        System.out.print("请输入要领养宠物的名字：");
        String name=input.next();
        //2.选择宠物类型
        System.out.print("请输入要领养宠物的类型(1.狗狗 2，企鹅)：");
        switch (input.nextInt()){
            case 1:
                //如果是狗狗请选择狗狗品种
                System.out.print("请选择狗狗的品种：(1.聪明的拉布拉多犬)"+"2.酷酷的雪纳瑞犬");
                String strain=null;
                if(input.nextInt()==1){
                    strain="聪明的拉布拉多犬";
                }else {
                   strain="酷酷的雪纳瑞犬";
                }
                //创建狗狗对象并赋值
                Dog dog=new Dog();
                dog.name=name;
                dog.strain=strain;
                //输出狗狗信息
                dog.print();
                break;
            case 2:
                //如果是企鹅，选择性别
                System.out.print("请选择企鹅的性别：(1.Q仔 2.Q妹)");
                String sex=null;
                if(input.nextInt()==1){
                    sex="Q仔";

                }else {
                    sex="Q妹";
                }
                //创建企鹅对象并赋值
                Penguin Pgn=new Penguin();
                Pgn.name=name;
                Pgn.sex=sex;
                //输出企鹅信息
                Pgn.print();
        }
    }
}
