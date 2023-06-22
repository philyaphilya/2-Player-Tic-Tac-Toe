public class TicTacToe
{
   private String[][] board;
   private int turn;
   
   public TicTacToe()
   {
       board = new String[3][3];
       for(int i = 0; i < 3; i++)
       {
            board[0][i] = "-";  
            board[1][i] = "-";  
            board[2][i] = "-";  
        }
    }
    
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   public String[][] getBoard()
   {
       return board;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  " + "0" + " 1" + " 2");
       for(int row = 0; row < board.length; row++)
       {
           System.out.print(row + " ");
           for(int col = 0; col < board[0].length; col++)
           {
               System.out.print(board[row][col] + " ");
           }
           System.out.println();
       }
   }
   
   public boolean isFull()
   {
        for(int row = 0; row < board.length; row++)
        {
           for(int col = 0; col < board[0].length; col++)
           {
               if(board[row][col] == "-")
               {
                   return false;
               }
           }
        }
        return true;
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col] == "-")
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(turn%2 == 0)
       {
           board[row][col] = "X";
           turn++;
       }
       else
       {
           board[row][col] = "O";
           turn++;
       }
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for(String[] rows : board)
       {
           for(int row = 0; row < rows.length; row++)
           {
               if(board[row][0] == "X")
               {
                    if(board[row][1] == "X")
                    {
                        if(board[row][2] == "X")
                        {
                            return true;
                        }
                    }
                }
               else if(board[row][0] == "O")
               {
                    if(board[row][1] == "O")
                    {
                        if(board[row][2] == "O")
                        {
                            return true;
                        }
                    }
               }
      
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for(String[] cols : board)
       {
           for(int col = 0; col < cols.length; col++)
           {
               if(board[0][col] == "X")
               {
                    if(board[1][col] == "X")
                    {
                        if(board[2][col] == "X")
                        {
                            return true;
                        }
                    }
                }
               else if(board[0][col] == "O")
               {
                    if(board[1][col] == "O")
                    {
                        if(board[2][col] == "O")
                        {
                            return true;
                        }
                    }
               }
      
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if(board[1][1] == "X" && board[0][2] == "X" && board[2][0] == "X")
       {
           return true;
       }
       else if(board[1][1] == "X" && board[0][0] == "X" && board[2][2] == "X")
       {
           return true;
       }
       else if(board[1][1] == "O" && board[0][2] == "O" && board[2][0] == "O")
       {
           return true;
       }
       else if(board[1][1] == "O" && board[0][0] == "O" && board[2][2] == "O")
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if(checkDiag() || checkRow() || checkCol())
       {
           return true;
       }
       return false;
   }
   
   public boolean checkTie()
   {
       if(isFull() && !checkWin())
       {
           return true;
       }
       return false;
   }

}
