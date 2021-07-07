package Dames;

/**
 * 示例十 示例十一
 * 示例十二 示例十三
 */
public class DogTen {
  private   String name="无名氏";//昵称，默认无名氏
    private  int health=100;//健康值，默认100
    private  int love=0;//亲密度
    private String strain="聪明的拉布拉多犬";//品种
    /**
     * 通过构造方法指定狗狗的昵称，品种
     */
    public DogTen(String name,String strain){
        this.name=name;
        this.strain=strain;
    }
    public DogTen(){

    }

    /**
     *通过吃饭增加健康值
     */
    public void eat(){
        if(health>=100){
            System.out.println("狗狗你需要多运动呀！");
        }else {
            health=health+3;
            System.out.println("狗狗吃饱饭了！");
        }
    }

    /**
     * 通过玩游戏与主人增加亲密度减少健康值
     */
    public  void paly(){
        if(health<60){
            System.out.println("狗狗生病了！");
        }else {
            System.out.println("狗狗正在和主人玩耍。");
            health=health-10;
            love=love+5;
        }
    }

    /**
     * 读取狗狗昵称
     * @return 昵称
     */
    public  String getName(){
        return name;
    }
    /**
     * 指定狗狗昵称
     * @return 昵称
     */
    public void  setName(String name){
        this.name=name;
    }

    /**
     * 读取狗狗健康值
     * @return 健康值
     */
    public int getHealth(){
        return health;
    }
    /**
     * 指定狗狗健康值，对健康范围进行判断
     * @return 健康值
     */
    public void  setHealth(int health){
        if(health>100||health<0){
            this.health=40;
            System.out.println("健康值在0和100之间，默认是40");
        }else {
            this.health=health;
        }
    }

    /**
     * 读取狗狗亲密度
     * @return 亲密度
     */
    public int   getLove(){
      return  love;
    }

    /**
     * 指定狗狗亲密度
     * @return 亲密度
     */
    public  void setLove(int love){
        this.love=love;
    }
    /**
     * 读取狗狗品种
     * @return 品种
     */
    public  String  getStrain(){
        return strain;
    }
    /**
     * 指定狗狗品种
     * @return 品种
     */
  public void  setStrain(String strain){
      this.strain=strain;

  }
    /**
     * 输出狗狗信息
     */
    public  void  print(){
        System.out.println("宠物的自白：\n我的名字叫"+this.name+"健康值是"+this.health+"，和主人的亲密度是是"+this.love+",我是一只"+this.strain+"。");
    }
    /**
     * 示例十一 示例十三
     */
    public static void main(String[] args) {
        DogTen dog=null;
        dog=new DogTen();
        //dog.health=300;
        dog.setName("欧欧");
        dog.setHealth(300);
        System.out.println("昵称是："+dog.getName());
        System.out.println("健康值是："+dog.getHealth());
        dog.print();
        System.out.println("\n");
        dog=new DogTen("欧欧","酷酷的雪纳瑞犬");
        dog.paly();
        System.out.println("健康值是："+dog.getHealth());
        dog.eat();
        dog.print();
    }
}
