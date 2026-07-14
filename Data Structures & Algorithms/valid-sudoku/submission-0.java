class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++)
        {
            HashSet<Character> row = new HashSet<>();
            for(int d = 0; d < 9; d++)
            {
                if (board[i][d] == '.')
                {
                    continue;
                }
                if(!row.add(board[i][d]))
                {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i++)
        {
            HashSet<Character> column = new HashSet<>();
            for(int d = 0; d < 9; d++)
            {
                if (board[d][i] == '.')
                {
                    continue;
                }
                if(!column.add(board[d][i]))
                {
                    return false;
                }
            }
        }
        
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> seen = new HashSet<>();
                for (int r = boxRow * 3; r < boxRow * 3 + 3; r++) {
                    for (int c = boxCol * 3; c < boxCol * 3 + 3; c++) {
                        char val = board[r][c];
                        if (val == '.') continue;
                        if (!seen.add(val)) return false;
                    }
                }
            }
        }
        return true;
    }
}
