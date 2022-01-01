package newpackage;

import java.util.Scanner;
public class staff
{
    public String sid, sname, desg, sex;
    public int salary;
    public void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    public void info()
    {
        System.out.println(sid + "\t" + sname + "\t"+ desg + "\t" + sex + "\t" + salary);
    }
}

