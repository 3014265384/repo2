package KeHou;

public class Student2 {
    private String name="李四";
    private int  age=18;
    private   String Zhuanye="软件开发";
    private  final  String SEX_MAIE="男";
    private  final  String SEX_FEMAIE="女";
    String sex=SEX_MAIE;
public Student2(String name,int age){
    this.sex="男";
    this.Zhuanye="ACCP";
    this.name=name;
    this.age=age;
}

    public Student2(String name,int age,String sex,String zhuanye){
        this.sex=sex;
        this.Zhuanye=zhuanye;
        this.name=name;
        this.age=age;
    }


    public void sayHi(){
        System.out.println("大家好！我是"+this.name+",今年"+this.age+"!"+"专业是"+this.Zhuanye+",性别为"+this.sex);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Student2 stu=null;
        stu=new Student2("韩信",18);
        stu.sayHi();
        stu=new Student2("李白",20,"男","打野");
        stu.sayHi();
    }
}
