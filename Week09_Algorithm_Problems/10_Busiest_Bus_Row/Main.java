import java.util.*;
public class Main {
    // Returns {rowIndex, rowTotal}; strict comparison preserves the smaller index on ties.
    static int[] busiestRow(int[][] grid){int bestRow=0,bestTotal=-1;for(int r=0;r<grid.length;r++){int total=0;for(int value:grid[r])total+=value;if(total>bestTotal){bestTotal=total;bestRow=r;}}return new int[]{bestRow,bestTotal};}
    // O(r*c) time and O(1) auxiliary space, excluding the input grid.
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int rows=sc.nextInt(),cols=sc.nextInt();int[][] grid=new int[rows][cols];for(int r=0;r<rows;r++)for(int c=0;c<cols;c++)grid[r][c]=sc.nextInt();int[] answer=busiestRow(grid);System.out.println("Row "+answer[0]+", Total "+answer[1]);}
}
