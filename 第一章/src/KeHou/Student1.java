
package KeHou;

public class Student1 {
    private String name="李四";
    private int  age=18;
    public String getName(){
        return name;

    }
    public  void  setName(String name){
        this.name=name;
    }
    public  int getAge(){
        return age;
    }
    public  void setAge(int age){
        if(age<16){
            this.age=16;
            System.out.println("年龄不能小于16岁！");
        }else {
            this.age=age;
        }
    }
    public void sayHi(){
        System.out.println("大家好！我是"+this.name+",今年"+this.age+"!");
    }

    public static void main(String[] args) {
        Student1 stu=new Student1();
        stu.setAge(17);
        stu.setName("韩信");
        stu.sayHi();
    }
}
