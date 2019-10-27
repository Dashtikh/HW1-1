package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("mizane hoqoqe khod ra vared konid: ");
        Scanner scanner = new Scanner(System.in);
        int hoqoq = scanner.nextInt();
        System.out.println("mizane qeste mahane ra vared koonid: ");
        int qest = scanner.nextInt();
        if ((hoqoq - qest)>0)
        System.out.println("mizane hoqoqe baqi mande shoma: "+ (hoqoq - qest));
        else System.out.println("chizi baraye shoma namande :D");
        System.out.println("pushed to origin !");


    }
}
