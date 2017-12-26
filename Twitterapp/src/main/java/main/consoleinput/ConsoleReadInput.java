package main.consoleinput;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReadInput implements ReadInput {
    private Scanner sc;

    public ConsoleReadInput()
    {
        sc=new Scanner(System.in);
    }

    @Override
    public String readInput() {
        return sc.nextLine();
    }
}
