package student_pavel_sharkel.lesson_6.homeworks.level_5;

public class TicTacToe {

        public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
            for (int i = 0; i < field.length; i++) {
                if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                    return true;
                }
            }
            return false;
        }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

            if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
                return true;
            } else if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
                return true;
            } else return false;

    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }

    public boolean isDrawPosition(int[][] field) {
            TicTacToe ticTacToe = new TicTacToe();

                if ((!ticTacToe.isWinPositionForVerticals(field, 1)) && (!ticTacToe.isWinPositionForVerticals(field, 0))) {
                        if ((!ticTacToe.isWinPositionForHorizontals(field, 1)) && (!ticTacToe.isWinPositionForHorizontals(field, 0))) {
                            if ((!ticTacToe.isWinPositionForDiagonals(field, 1)) && (!ticTacToe.isWinPositionForDiagonals(field, 0))) {
                                for (int i = 0; i < field.length; i++) {
                                    for (int j = 0; j < field[i].length; j++) {
                                        if (field[i][j] != -1) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                }
            return false;
    }

}
