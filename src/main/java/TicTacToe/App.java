package TicTacToe;

public class App {
    public static void main(String[] args) throws Exception {
        Field field = new Field();
        field.printField();

        Symbol symbol1 = new Symbol("x");
        Symbol symbol2 = new Symbol("0");
        Player p1 = new Player(symbol1,field);
        Player p2 = new Player(symbol2,field);

        p1.putSymbol(3);
        p2.putSymbol(2);

        field.printField();

    }
}
