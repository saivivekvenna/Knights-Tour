package tour1;
import java.util.Scanner;


public class app {


    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("How big do you want the chess board to be?");
        int Size = Input.nextInt(); // seeking the size of the grid
        final int  chess_board_size = Size;
        knightsTour knightTour = new knightsTour(chess_board_size);
        knightTour.solveKnightTourProblem();
    }
}