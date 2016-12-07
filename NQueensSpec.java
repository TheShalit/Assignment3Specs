import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shalev on 07/12/2016.
 */
public class NQueensSpec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] board = NQueens.nQueens(n);
        System.out.println("Solution For " + n + ": " + Arrays.toString(board));
        
        NQueens.printBoard(board);

        System.out.println("Is it legal? " + NQueens.isLegalSolution(board, n));
    }
}
