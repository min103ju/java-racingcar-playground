package view;

import car.Car;
import car.Cars;
import strategy.RandomMoveStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("경주할 자동차 이름을 입력하세요.\n" +
                "(이름은 쉼표(,)를 기준을 구분).");
        String carNames = br.readLine();

        System.out.println("시도할 횟수는 몇회인가요?");
        int goal = Integer.parseInt(br.readLine());

        Cars cars = new Cars(carNames);
        List<String> winner = new ArrayList<>();

        while (winner.isEmpty()) {
            cars.getCars().stream()
                    .forEach(car -> car.move(new RandomMoveStrategy()));

            System.out.println();

            winner = cars.findWinner(goal);
        }

        printWinner(winner);
    }

    static void printWinner(List<String> winner) {
        System.out.println(winner.stream().collect(joining(",")) +
                "가 최종 우승했습니다.");
    }
}
