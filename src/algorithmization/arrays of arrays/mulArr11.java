import static java.lang.Math.random;

public class mulArr11 {
    public static void main(String[] args) {
        int arr[][] = new int[10][20];
        int lines[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (random() * 15);
                System.out.printf(arr[i][j] + " ");
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            System.out.println();
            if (count >= 3) {
                lines[i] = i + 1;
            }
        }
        System.out.println("Строки, имеющие 3 и более пятёрки:");
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != 0) {
                System.out.printf(lines[i] + " ");
            }
        }
    }
}
