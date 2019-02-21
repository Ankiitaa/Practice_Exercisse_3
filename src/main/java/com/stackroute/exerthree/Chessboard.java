/*Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WW represents white color and BB represents Black color.*/

package com.stackroute.exerthree;

public class Chessboard {
        public String[][] ColouredBoxes(){
            String arr[][]=new String[8][8];
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if((i%2)==(j%2))
                    {
                        arr[i][j]="WW";
                    }
                    else
                    {
                        arr[i][j]="BB";
                    }
                }
            }
            return arr;
        }
    }


