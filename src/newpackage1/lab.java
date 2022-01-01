package newpackage1;

import java.util.Scanner;
public class lab
{
   public String fecility;
    public int lab_cost;
    public void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
   public void info1()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}

