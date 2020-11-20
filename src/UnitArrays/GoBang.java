package UnitArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoBang {
    private static final int BOARD_SIZE = 13;
    private String[][] board;

    //棋盘初始化，并在控制台画出棋盘
    public void initBoard(){
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++){
            for (int j = 0; j < BOARD_SIZE; j++){
                board[i][j] = "+";
            }
        }
    }

    //在控制台输出棋盘
    public void printBoard(){
        for (int i = 0; i < BOARD_SIZE; i++){
            for (int j = 0; j < BOARD_SIZE; j++){
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) throws Exception{
        GoBang gb = new GoBang();
        gb.initBoard();
        gb.printBoard();

        //用于获取键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        //输入
        while ((inputStr = br.readLine()) != null){
            //将字符串以逗号隔开，分为两个
            String[] posStrArray = inputStr.split(",");
            //将两个字符串转换为坐标（十进制数字的字符串，转化为十进制数字）
            int xPos = Integer.parseInt(posStrArray[0]);
            int yPos = Integer.parseInt(posStrArray[1]);
            //将对应的坐标点赋值
            gb.board[xPos - 1][yPos - 1] = "*";

            //每次落子之后，重新打印棋盘
            gb.printBoard();
            System.out.println("请输入下棋的坐标，以x,y的形式：");

        }
    }

}
