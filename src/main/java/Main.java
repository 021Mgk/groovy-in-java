import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Binding binding = new Binding();
        GroovyShell shell = new GroovyShell(binding);


        binding.setVariable("words", "world hello");
       // shell.evaluate("def wordsArray = words.split(' '); wordsArray[1] + ' ' + wordsArray[0]\n");




        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            System.out.println(a);
            if (a == 1){
                Object response =  shell.evaluate(new File("src/main/groovy/wordSwapper.groovy"));
                System.out.println(String.valueOf(response));
            }
        }
    }
}
