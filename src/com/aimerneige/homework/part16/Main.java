package com.aimerneige.homework.part16;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Student.txt");
        String content[] = {"商品列表：", "电视机，2567元/台",
                "洗衣机，3562元/台", "冰箱，6573元/台"};
        try {
            FileWriter outOne = new FileWriter(file);
            BufferedWriter outTwo = new BufferedWriter(outOne);
            for (String str:content) {
                outTwo.write(str);
                outTwo.newLine();
            }
            outTwo.close();
            outOne.close();
            FileReader inOne = new FileReader(file);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s = null;
            while ((s = inTwo.readLine())!= null) {
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}

// 课本P187页例10.7、P191页例10.10、P193页例10.11、P195页例10.13