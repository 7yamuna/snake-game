import javax.swing.*; //To create JFrame
public class App {
    public static void main(String[] args) throws Exception {
       int boardWidth=600;
       int boardHeight=boardWidth;
       JFrame j= new JFrame("snake");
        j.setVisible(true);
        j.setSize(boardWidth,boardHeight);
        j.setLocationRelativeTo(null);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //snakegame file for jpanel
        snakegame snakeGame = new snakegame(boardWidth, boardHeight);
        j.add(snakeGame);
        j.pack();
        snakeGame.requestFocus();

    }
}
