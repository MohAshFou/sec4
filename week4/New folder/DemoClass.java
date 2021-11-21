/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DemoClass {
    public static void main(String[] args) {
        int str_work, current_year;
        
        Scanner in = new Scanner(System.in);
        System.out.println("please, enter your desire_memeber");
        String type = in.nextLine();
        memeberFactory me = new memeberFactory();
        staff m= me.get_memeber(type);
          str_work     = in.nextInt();
          current_year =in.nextInt();
        m.setCurrent_year(current_year);
        m.setStr_work(str_work);
        
        System.out.println(m.getYearsOfWork());
    }
    
    
}
