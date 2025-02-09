// leetcode 36
import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9 ;
        HashSet<Character>[]rows=new HashSet[N];
        HashSet<Character>[]cols=new HashSet[N];
        HashSet<Character>[]boxes=new HashSet[N];
        //the above 4 lines of code  mean here we are creating 3 arrays which have hashsets as elements in them, and each array size is of 9.
        for(int i=0;i<N;i++){ // initating the hashset
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }
        for(int i=0;i<N;i++){ // now we are iterating in the given 9x9 board.
            for(int j=0;j<N;j++){
                char val = board[i][j];
                if(val=='.'){
                    continue;
                }
                if(rows[i].contains(val)){
                    return false; // if that hashset which is belongs to thet spevific row has that value  , that mean there is a duplication in that specific row
                }
                rows[i].add(val);// if that hashset doesnt have that velue; so now we add that value in the hashset
                if(cols[j].contains(val)){
                    return false;
                }
                cols[j].add(val);
                int idx = (i/3)*3+(j/3); // special formula kind of thing to access the each 3x3 box in the given  9x9 board, as his part is the more trickier one in the given problem statement.
                if(boxes[idx].contains(val)){
                    return false;
                }
            }
        }
        return true;

    }
}