import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);
        game.printBoard();
        System.out.println();
        
        while(!game.checkWin() && !game.isFull())
        {
            if(game.getTurn()%2==0)
            {
                System.out.println("What row would you like to place your X?");
                int rowResponse = input.nextInt();
                System.out.println("Column?");
                int colResponse = input.nextInt();
                System.out.println();
                
                if(game.pickLocation(rowResponse, colResponse))
                {
                    game.takeTurn(rowResponse, colResponse);
                    game.printBoard();
                    System.out.println();
                }
            }
            else
            {
                System.out.println("What row would you like to place your O?");
                int rowResponse = input.nextInt();
                System.out.println("Column?");
                int colResponse = input.nextInt();
                System.out.println();
                
                if(game.pickLocation(rowResponse, colResponse))
                {
                    game.takeTurn(rowResponse, colResponse);
                    game.printBoard();
                    System.out.println();
                }
            }
            
        }
        if((game.getTurn()-1)%2 ==0 && !game.checkTie())
        {
            System.out.println("X won!!");
        }
        else if((game.getTurn()-1)%2 !=0 && !game.checkTie())
        {
            System.out.println("O won!!");
        }
        else
        {
            System.out.println("It was a tie!!");
        }
        
        
    }
}
