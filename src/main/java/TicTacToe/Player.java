package TicTacToe;

public class Player {
    private Symbol symbol;
    private Field field;

    Player(){

    }

    Player(Symbol symbol, Field field){
        this.symbol = symbol;
        this.field = field;
    }

    void putSymbol(int pos) throws Exception {
        this.field.setSymbol(this.symbol,pos);
    }


}
