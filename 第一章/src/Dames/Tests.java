package Dames;

/**
 * 示例五
 */
public class Tests {
    public static void main(String[] args) {
        Penguin pgn=new Penguin();
        System.out.println("第一个企鹅的性别是"+pgn.sex+"。");
        pgn=new Penguin();
        pgn.sex=pgn.SEX_FEMAIE;
        System.out.println("第二个企鹅的性别是"+pgn.sex+"。");
        pgn=new Penguin();
        pgn.sex=pgn.SEX_MAIE;
        System.out.println("第三个企鹅的性别是"+pgn.sex+"。");
    }
}
