package readinput;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadInputConsole implements ReadInput {
    private Scanner scanner;

    public ReadInputConsole() {
        scanner = new Scanner(System.in);
    }

    public String readInput() {
        return scanner.nextLine();
    }
}
