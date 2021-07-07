package Dames;

/**
 * 示例七 示例八
 */
public class PenguinSeven {
    String name="无名氏";//昵称，默认无名氏
    int health=100;//健康值，默认100
    int love=0;//亲密度
    String sex="Q仔";

    /**
     * 无参构造方法
     */
    public PenguinSeven(){
        name="楠楠";
        love=0;
        sex="Q妹";
        System.out.println("执行构造方法");

    }
    /**
     * 两个参数的构造方法
     */
    public PenguinSeven(String name,String sex){
        this.name=name;
        this.sex=sex;
    }

    /**
     * 四个参数的构造方法
     */
    public PenguinSeven(String name,int health,int love,String sex){
        this.name=name;
        this.sex=sex;
        this.love=love;
        this.health=health;
    }

    /**
     * 输出企鹅信息
     */
    public  void  print(){
        System.out.println("宠物的自白：\n我的名字叫"+this.name+"健康值是"+this.health+"，和主人的亲密度是是"+this.love+",性别是"+this.sex+"。");
    }
    /**
     * 测试无参构造方法
     */
    public static void main(String[] args) {
        PenguinSeven pgn=null;
        pgn=new PenguinSeven();
        pgn.print();
        pgn=new PenguinSeven("亚亚","企鹅");
        pgn.print();
        pgn=new PenguinSeven("美美",80,20,"Q仔");
        pgn.print();
    }
}
