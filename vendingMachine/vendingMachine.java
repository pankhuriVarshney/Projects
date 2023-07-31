

import java.util.*;
class vmm extends vm
{
    vmm(int c, int p, int s, String pass)
    {
        coke=c;
        pepsi=p;
        soda=s;
        password=pass;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNUMBER OF COKE:"+coke+"\nNUMBER OF PEPSI:"+pepsi+"\nNUMBER OF SODA:"+soda);
        System.out.print("Press 1: TO BUY COKE(RS.25 PER CAN)\nPress 2: TO BUY PEPSI(RS.35 PER CAN)\nPress 3: TO BUY SODA(RS.45 PER CAN)\nPress 4: TO REFUND\nPress 5: TO RESET VENDING MACHINE\nPress 6: TO EXIT\nEnter your choice: ");
        ch=sc.nextInt();
    }
    public static void main(String args[])
    {
        vmm obj=new vmm(25,25,25,"abc123");
        while(true)
        {
            obj.input();
            switch(ch)
            {
                case 1:
                case 2:
                case 3:
                    obj.sell();
                    break;
                case 4:
                    obj.refund();
                    break;
                case 5:
                    obj.reset();
                    break;
                case 6:
                    System.exit(0);
            }
            pch=ch;
        }
    }
}
 