import java.util.*;
class ticTacToe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Welcome to the game of tic tac toe!");
        char a[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        System.out.println("The gameboard is as follows: ");
        char ch=' ';
        for(int i=0;i<3;i++)
        {
            System.out.println("-----------------");
            for(int j=0;j<3;j++)
            {                
                System.out.print("|  "+a[i][j]+"  ");                
            }
            System.out.println();
        }
        for(int i=0;i<9;i++)
        {
            if(i%2==0)
            {
                System.out.println("Enter the slot number to place 'X' in: ");
                ch='X';
            }
            else
            {
                System.out.println("Enter the slot number to place 'O' in: ");
                ch='O';
            }
            int n=sc.nextInt()-1;
            if(n>9) { System.out.println("Invalid Number"); --i; continue;}
            int r=n/3;
            int c=n-(r*3);
            a[r][c]=ch;
            for(int k=0;k<3;k++)
            {
                System.out.println("-----------------");
                for(int j=0;j<3;j++)
                {                
                    System.out.print("|  "+a[k][j]+"  ");                
                }
                System.out.println();
            }            
            if((a[r][0]=='X'&&a[r][1]=='X'&&a[r][2]=='X')||(a[0][c]=='X'&&a[1][c]=='X'&&a[2][c]=='X')||(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')||(a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X'))
            {
                System.out.println("Congratulations 'X' you have won!");
                System.exit(0);
            }
            else if((a[r][0]=='O'&&a[r][1]=='O'&&a[r][2]=='O')||(a[0][c]=='O'&&a[1][c]=='O'&&a[2][c]=='O')||(a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O')||(a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O'))
            {
                System.out.println("Congratulations 'O' you have won!");
                System.exit(0);
            }
        }
    }
}
