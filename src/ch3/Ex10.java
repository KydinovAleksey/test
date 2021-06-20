package ch3;

import java.io.File;

public class Ex10 {
    public static void main (String[] args){
        File file = new File("src");
        File[] files = file.listFiles(fil -> fil.isDirectory());

        for (File fil : files) {
            System.out.println(fil.getName());
        }

    }
}
