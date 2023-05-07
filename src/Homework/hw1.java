package src.Homework;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
                // 변수 생성
                int n = 3;
                // 계산
                double kcal = calcPorkCalories(n);
                // 출력
                System.out.printf("삼겹살 %d인분: %.2f kcal", n, kcal);
            }
            public static double calcPorkCalories(int n) {
                return (180 * n) * 5.179;
            }
        }
