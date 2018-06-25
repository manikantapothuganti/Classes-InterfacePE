package com.statckroute.utility;

public class ChessBoard {
	public String[][] ChessBoardformer()
	{
		String chessBoard[][]=new String[8][8];
		for (int i=0;i<8;i++)
		{
			for (int j=0;j<8;j++)
			{
				if ((i+j)%2==0)
				{
					chessBoard[i][j]="WW";
				}
				else
				{
					chessBoard[i][j]="BB";
				}
			}
		}
		for (int i=0;i<8;i++)
		{
			for (int j=0;j<8;j++)
			{
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
		
		return chessBoard;
	}

}
