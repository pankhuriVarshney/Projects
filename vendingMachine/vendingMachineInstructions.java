import java.util.*;
class vm implements vendingMachine
{    
    static int coke,pepsi,soda;
    static int n;
    static double money=0,cost,change=0;
    static String password;
    static int ch, pch=0;
    Scanner sc=new Scanner(System.in);
    public void sell()
    {
        System.out.print("Enter number of cans: ");
        n=sc.nextInt();
        if(ch==1)
        {
            if(coke==0) {System.out.println("NO CANS AVAILABLE!");return;}
            if(coke-n<0)
            {
                System.out.println("CANS MAXED OUT! "+coke+" cans available");
                cost=coke*cokeCost;
                coke=0;
            }
            else
            {cost=n*cokeCost; coke-=n;}
        }
        else if(ch==2)
        {
            if(pepsi==0) {System.out.println("NO CANS AVAILABLE!");return;}
            if(pepsi-n<0)
            {
                System.out.println("CANS MAXED OUT! "+pepsi+" cans available");
                cost=pepsi*pepsiCost;
                pepsi=0;
            }
            else
            {cost=n*pepsiCost; pepsi-=n;}
        }
        else if(ch==3)
        {
            if(soda==0) {System.out.println("NO CANS AVAILABLE!");return;}
            if(soda-n<0)
            {
                System.out.println("CANS MAXED OUT! "+soda+" cans available");
                cost=soda*sodaCost;
                soda=0;
            }
            else
            {cost=n*sodaCost; soda-=n;}
        }
        money=0;
        System.out.print("Enter Rs."+cost+": ");        
        while(true)
        {
            money+=sc.nextDouble();
            if(money>=cost)
            break;
            else {System.out.println("Amount Paid is Less! Enter Rs."+(cost-money)+" more: ");}
        }
        change=money-cost;
        System.out.println("TRANSACION SUCCESSFUL\nCOST PRICE:\tRs."+cost+"\nAMOUNT PAID:\tRs."+money+"\nAMOUNT RETURNED:\tRs."+change);
    }    
    public void refund()
    {
        if(pch==0||pch==4||pch==5)System.out.println("NO TRANSACTION TO BE REFUNDED");
        else 
        {
            System.out.println("MONEY REFUNDED: Rs."+money);
            money=0;
            if(pch==1) coke+=n;
            else if(pch==2) pepsi+=n;
            else if(pch==3) soda+=n;
        }
    }
    public void reset()
    {
        System.out.print("Enter the Authorization Password: ");
        String p=sc.next();
        if(!(p.equals(password)))
        System.out.println("Access Denied! INCORRECT PASSWORD");
        else
        {
            coke=25;
            pepsi=25;
            soda=25;
            System.out.println("RESET COMPLETE!");
        }
    }
}