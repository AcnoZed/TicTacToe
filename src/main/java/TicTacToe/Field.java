package TicTacToe;


public class Field{
  private Symbol[][] field;

  Field(){
    this.field = new Symbol[3][3];
  }
  Field(Symbol[][] field){
    this.field = field;
  }
  void initField(){
    for(int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        field[i][j] = new Symbol(i + "" + j);
      }
    }
  }

  void printField(){
    for(int i = 0; i < 3; i++){
      for(int j = 0; j< 3;j++) {
        if (field[i][j] == null) {
          System.out.print("- ");
        } else {
          System.out.print(field[i][j].printSymbol() + " ");
        }
      }
      System.out.println(" ");
    }
  }

  void setSymbol(Symbol newSymbol, int pos){
    int xPos = pos / 3;
    int yPos = pos % 3;
    field[xPos][yPos] = newSymbol;
  }

}
