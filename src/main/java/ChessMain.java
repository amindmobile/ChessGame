import java.net.SocketTimeoutException;
import java.security.KeyStore;

public class ChessMain {

    public static void main(String[] args) {

        Player whitePlayer = new Player("April Neel", "april@google.com", true, 2000, 21);
        Player blackPlayer = new Player("Vlamirid Punti", "punti@kremel.ru", false, 5000, 62);

        System.out.println("Имя первого игрока: " + whitePlayer.getName());
        System.out.println("E-mail первого игрока: " + whitePlayer.getEmail());
        String whitePlayercolor;
        if (whitePlayer.isWhite()){
            whitePlayercolor = "Белый";
        }
        else whitePlayercolor = "Черный";
        System.out.println("Цвет фигур первого игрока: " + whitePlayercolor);
        System.out.println("Ранг первого игрока: " + whitePlayer.getRank());
        System.out.println("Возраст первого игрока: " + whitePlayer.getAge());
        System.out.println();

        System.out.println("Имя второго игрока: " + blackPlayer.getName());
        System.out.println("E-mail второго игрока: " + blackPlayer.getEmail());
        String blackPlayercolor;
        if (blackPlayer.isWhite()){
            blackPlayercolor = "Белый";
        }
        else blackPlayercolor = "Черный";
        System.out.println("Цвет фигур второго игрока: " + blackPlayercolor);
        System.out.println("Ранг второго игрока: " + blackPlayer.getRank());
        System.out.println("Возраст второго игрока: " + blackPlayer.getAge());

        System.out.println();
        System.out.println(whitePlayer);
        System.out.println(blackPlayer);

        try {
            whitePlayer.setRank(10000);
        }
        catch (IllegalArgumentException err){
            System.out.println("Введите новое значение: ");
        }

    }
}
