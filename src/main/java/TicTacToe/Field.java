package TicTacToe;


public class Field{
  private Symbol[][] field;

  Field(){
    this.field = new Symbol[3][3];
  }
  Field(Symbol[][] field){
    this.field = field;
  }
  Field initField(){
    for(int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        field[i][j] = new Symbol(i + "" + j);
      }
    }
    return this;
  }

  void printField(){
    for(int i = 0; i < field.length; i++){
      for(int j = 0; j< field.length;j++) {
        if (field[i][j] == null) {
          System.out.print("- ");
        } else {
          System.out.print(field[i][j].printSymbol() + " ");
        }
      }
      System.out.println("");
    }
    System.out.println("----------------------------");
  }

  private boolean checkEmptyField(int posX, int posY){
    return this.field[posX][posY].equals(new Symbol("x")) || this.field[posX][posY].equals(new Symbol("o"));
  }


  void setSymbol(Symbol newSymbol, int pos) throws Exception {
    int xPos = pos / field.length;
    int yPos = pos % field.length;
    if(checkEmptyField(xPos,yPos)){
      field[xPos][yPos] = newSymbol;
    } else {
      throw new Exception();
    }
  }

}
