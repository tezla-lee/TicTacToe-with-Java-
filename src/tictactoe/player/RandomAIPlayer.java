package tictactoe.player;

import tictactoe.TicTacToe;

public class RandomAIPlayer extends Player {

    public void getKeyboardInput() {
        TicTacToe ticTacToe = TicTacToe.getInstance();
        while (true) {
            Player.pos.setX((int) (Math.random() * 3));
            Player.pos.setY((int) (Math.random() * 3));
            if (Player.pos.getX() < 0 || Player.pos.getY() < 0 || Player.pos.getX() > 2 || Player.pos.getY() > 2 ||ticTacToe.board[pos.getX()][pos.getY()] == 1 || ticTacToe.board[pos.getX()][pos.getY()] == 2) {
                continue;
            }
            break;
        }
        System.out.println("AI 실행: (" + Player.pos.getX() + ", " + Player.pos.getY() + ")");
    }
}