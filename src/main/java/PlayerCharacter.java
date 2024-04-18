import static java.nio.file.Files.move;

public class PlayerCharacter {

    // Class-level variables: here must use 'static'
    static int xPosition = 0;  // 1. not 'int static'!! 2. 'public static int xPosition = 0' also ok!
    static int yPosition = 0;

    //Florian's code doesn't have 'main' method
    public static void main(String[] args) {
    }


 //   public static int getX(int value){
    public static int getX(){
        return xPosition;
    }

//    public static int getY(int value){
    public static int getY(){
        return yPosition;
    }

    public static int move(String direction){
        if (direction == "W"){   //teacher code: direction.equals("W")
            yPosition++;
            return getY();      //nicht gut: return yPosition;
        }
        else if(direction.equals("S")){         //direction == "S"
            yPosition--;
            return getY();
        }
        else if(direction == "D"){
            xPosition++;
            return getX();     //nicht gut: return xPosition;
        }
        else if(direction == "A"){
            xPosition--;
            return getX();
        }
        else
            return 100;     // if forget else (z.B. direction = "Z", then also need to return sth. int!)

     }




}
