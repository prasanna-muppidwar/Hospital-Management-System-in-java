package newpackage1;

import java.util.Scanner;
public class fecility 
{
   public String fec_name;
    public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    public void info1()
    {
        System.out.println(fec_name);
    }
}

