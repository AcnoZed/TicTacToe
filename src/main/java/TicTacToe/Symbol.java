package TicTacToe;

public class Symbol{
  private String symbol;

  public Symbol(){

  }

  public Symbol(String symbol){
    this.symbol = symbol;
  }

  String printSymbol(){
    return this.symbol + "";
  }

  @Override
  public boolean equals(Object o){
    if (o == this){
      return true;
    }

    if(!(o instanceof Symbol)){
      return false;
    }

    Symbol toBeCompared = (Symbol) o;

    return this.symbol.equals(toBeCompared.symbol);
  }



}
