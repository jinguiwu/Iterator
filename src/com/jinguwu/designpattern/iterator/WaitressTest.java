package com.jinguwu.designpattern.iterator;

/**
 * Created by jinguwu on 2015/1/24.
 */
public class WaitressTest {
    public static void main(String[] args){
        BreadFastMenu breadFastMenu = new BreadFastMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(breadFastMenu, dinnerMenu);
        waitress.printMenu();

    }
}
