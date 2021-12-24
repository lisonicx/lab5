//задание №1
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("введите размерность массива N:");
            N = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ошибка ввода данных. введите целое число N!");
            System.exit(1);
        }
        ArrayList<Float> alist = new ArrayList<>();
        if (N >= 2) {
            try {
                System.out.println("введите вещественные элементы массива через 'enter':");
                for (int i = 0; i < N; i++) {
                    alist.add(i, sc.nextFloat());
                }
                } catch (InputMismatchException e) {
                    System.out.println("ошибка ввода данных. введите вещественное значение элемента массива!");
                    System.exit(1);
                }
            int K = 0;
            try {
                System.out.println("введите иднекс K элемента массива, для которого произвести 'сглаживание'");
                K = sc.nextInt();
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("ошибка ввода данных. введите целое число K!");
            }
            if ((K >= 1) & (K <= N - 1)) {
                float sum = 0;
                float sa = 0;
                for (int i = 0; i < K; i++) {
                    sum = sum + alist.get(i);
                }
                sa = sum / K;
                LinkedList<Float> alist_new = new LinkedList<>();
                alist_new.addAll(alist);
                alist_new.set(K, sa);
                System.out.println("оригинальное состояние массива:");
                for (float elem : alist) {
                    System.out.print(elem + " ");
                }
                System.out.println();
                System.out.println("итоговое состояние массива:");
                for (float elem : alist_new) {
                    System.out.print(elem + " ");
                }
            } else {
                System.out.println("для введенного значения индекса K невозможно выполнить сглаживание.");
            }
        } else {
            System.out.println("для работы программы необходимо задать массив, который содержит два или более элементов.");

                }
            }

    }
