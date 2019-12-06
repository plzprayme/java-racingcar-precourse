package domain.Controller;

import java.util.Scanner;

public class InputManager {
    Scanner scanner;

    public InputManager() {
        this.scanner = new Scanner(System.in);
    }

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        return scanner.next();
    }

    public String[] inputCarNamesArray() {
        return inputCarNames().split(",");
    }

    public int inputNumberOfLaps() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return scanner.nextInt();
    }



}
