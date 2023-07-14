package java101;

public class writeTheLetterB {
    public static void main(String[] args) {
        String [][] matrix = new String [7][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if ((row == 0) || (row == 3) || (row == 6)) {
                    matrix[row][col] = " * ";
                }
                else if ((col == 0) || (col == 3)) {
                    matrix[row][col] = " * ";
                }
                else {
                    matrix[row][col] = "   ";
                }
            }
        }

        for (String [] rows : matrix) {
            for (String col : rows) {
                System.out.print(col);
            }
            System.out.println();
        }
        }
    }

