/* XO game */
package sec_2;
import java.util.Objects;
import java.util.Scanner;
public class p8_9 {
    public static void main(String[] args) {
        Scanner play = new Scanner(System.in);
        int[][] xo = new int[3][3];
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                xo[i1][i2] = 0;
                System.out.print("  " + xo[i1][i2] + "  |");
            }
            System.out.println();
        }
        int x = 0, y = 0, z = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            System.out.println("enter a row (0,1 or 2) for player 1 times"+(i3+1));
            x = play.nextInt();
            System.out.println("enter a column (0,1 or 2) for player 1 times"+(i3+1));
            y = play.nextInt();
            if(xo[x][y]==0){
                xo[x][y] = 1;}
            else if(xo[x][y]!=0){
                while(xo[x][y]!=0){
                    System.out.println("this position is not empty");
                    System.out.println("enter a row (0,1 or 2) for player 1 times"+(i3+1));
                    x = play.nextInt();
                    System.out.println("enter a column (0,1 or 2) for player 1times"+(i3+1));
                    y = play.nextInt();
                }
                xo[x][y]=1;
            }
            System.out.println("enter a row (0,1 or 2) for player 2 times "+(i3+1));
            x = play.nextInt();
            System.out.println("enter a column (0,1 or 2) for player 2 times "+(i3+1));
            y = play.nextInt();
            if(xo[x][y]==0){
                xo[x][y] = 2;}
            else if(xo[x][y]!=0){
                while(xo[x][y]!=0){
                    System.out.println("this position is not empty");
                    System.out.println("enter a row (0,1 or 2) for player 2times "+(i3+1));
                    x = play.nextInt();
                    System.out.println("enter a column (0,1 or 2) for player 2times "+(i3+1));
                    y = play.nextInt();
                }
                xo[x][y]=2;
            }
            if (i3 >= 2) {
                for (int i4 = 0; i4 < xo.length; i4++) {
                    if (xo[i4][0] == xo[i4][1] && xo[i4][1] == xo[i4][2] && xo[i4][0] == 1) {
                        System.out.println("player 1 is won");
                        z = 1;
                        break;
                    }
                    if (xo[i4][0] == xo[i4][1] && xo[i4][1] == xo[i4][2] && xo[i4][0] == 2) {
                        System.out.println("player 2 is won");
                        z = 1;
                        break;
                    }
                    if (xo[0][i4] == xo[1][i4] && xo[1][i4] == xo[2][i4] && xo[0][i4] == 1) {
                        System.out.println("player 1 is won");
                        z = 1;
                        break;
                    }
                    if (xo[0][i4] == xo[1][i4] && xo[1][i4] == xo[2][i4] && xo[0][i4] == 1 && xo[0][i4] == 2) {
                        System.out.println("player 2 is won");
                        z = 1;
                        break;
                    }
                    if(xo[0][0]==xo[1][1]&&xo[1][1]==xo[2][2]&&xo[0][0]==1){
                        System.out.println("player 1 is won");
                        z = 1;
                        break;
                    }
                    if(xo[0][0]==xo[1][1]&&xo[1][1]==xo[2][2]&&xo[0][0]==2){
                        System.out.println("player 2 is won");
                        z = 1;
                        break;
                    }
                    if(xo[0][2]==xo[1][1]&&xo[1][1]==xo[2][0]&&xo[0][2]==1){
                        System.out.println("player 1 is won");
                        z = 1;
                        break;
                    }
                    if(xo[0][2]==xo[1][1]&&xo[1][1]==xo[2][0]&&xo[0][2]==2){
                        System.out.println("player 1 is won");
                        z = 1;
                        break;
                    }
                }
            }
            if (z == 1)
                break;
        }
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                System.out.print("  " + xo[i1][i2] + "  |");
            }
            System.out.println();
        }
    }
}



