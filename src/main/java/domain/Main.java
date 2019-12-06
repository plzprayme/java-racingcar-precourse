/**
 * Main 클래스
 * <p>
 * 자동차 이름, 이동 횟수 입력 받을 예정
 * run() 함수도 호출할 예정
 * 이동 횟수만큼 반복 예정
 */
package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positionList = new ArrayList<>();

        String carNames;
        String[] splitedCarNames;
        int iterationNumber;
        int maxPosition;


        do {
            carNames = RacingManager.inputCarNames();
            splitedCarNames = RacingManager.splitCarNames(
                    carNames, ",");
        } while (RacingManager.namesLengthGraterThanFive(splitedCarNames));


        Car[] cars = new Car[splitedCarNames.length];

        for (int i = 0; i < splitedCarNames.length; i++) {
            cars[i] = new Car(splitedCarNames[i]);
            System.out.println(cars[i].getName());
        }

        System.out.println("시도할 횟수는 몇회인가요?");
        iterationNumber = scanner.nextInt();


        for (int i = 0; i < iterationNumber; i++) {
            System.out.println((i + 1) + "번");
        }

        for (int i = 0; i < splitedCarNames.length; i++) {
            for (int j = 0; j < splitedCarNames.length; j++) {
                cars[j].canYouGo();
                System.out.println(cars[j].getName() + " : "
                        + cars[j].getPosition());
            }
        }


        for (Car car : cars) {
            positionList.add(car.getPosition());
        }

        maxPosition = Collections.max(positionList);

        for (int i = 0; i < splitedCarNames.length; i++) {
            if (cars[i].getPosition() == maxPosition) {
                System.out.print(cars[i].getName() + " ");
            }
        }
        System.out.println("최종 우승!!");
    }
}
