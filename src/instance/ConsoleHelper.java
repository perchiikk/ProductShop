package instance;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readText(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        }
        catch (Exception e){
            ConsoleHelper.writeMessage("Произошла ошибка");
        }
        return null;
    }

    public static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(readText());
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Вы ввели неверное число. Повторите ввод");
            }
            catch (Exception e){
                ConsoleHelper.writeMessage("Произошла ошибка");
            }
        }
    }

}
