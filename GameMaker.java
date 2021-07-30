package Task;

public class GameMaker {
    public static int[][] sea = new int[5][5];

        //命中、波高し判定
    public void Bomb(int b_x,int b_y){
        if(sea[b_x][b_y]!=0){
            System.out.println("命中");
        }
        if(sea[b_x+1][b_y]!=0 || sea[b_x-1][b_y]!=0 || sea[b_x][b_y+1]!=0 || sea[b_x][b_y-1]!=0){
            System.out.println("波高し");
        }
    }
}
