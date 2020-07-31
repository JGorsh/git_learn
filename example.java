import java.util.Random;

public class Bubble {
    public static int[] gen() {
        int[] mas = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
<<<<<<< HEAD
            mas[i] = rnd.nextInt(50);
=======
            mas[i] = rnd.nextInt(13);
>>>>>>> 7e7f2be7c5f8c7bf966da773550651669cbb8e4c
        }
        return mas;
    }

    public static void sort(int[] m) {
        for (int i = 0; i < 10; i++)
            for (int j = 1; j < 10 - i; j++) {
                if (m[j] < m[j - 1]) {
                    int tmp = m[j];
                    m[j] = m[j - 1];
                    m[j - 1] = tmp;
                }
            }
    }

    public static void main(String[] args) {
        int[] m = gen();
        for (int i = 0; i < 10; i++) System.out.print(m[i] + " ");
        System.out.println();
        sort(m);
        for (int i = 0; i < 10; i++) System.out.print(m[i] + " ");
    }
}