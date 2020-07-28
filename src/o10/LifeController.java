package o10;

public class LifeController {
    public static void main(String[] args) {
        LifeBoard lifeBoard = new LifeBoard(10, 10);
        Life life = new Life(lifeBoard);
        LifeView view = new LifeView(lifeBoard);
        view.drawBoard();

        while (true) {
            switch (view.getCommand()) {
                case 1:
                    // Hantera musclick
                    life.flip(view.getRow(), view.getCol());
                    view.update();
                    break;
                case 2:
                    // Hantera next
                    life.newGeneration();
                    view.update();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
