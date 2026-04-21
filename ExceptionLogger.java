import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExceptionLogger {
    public static void log(Exception e) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(LocalDateTime.now() + " | Ошибка: " + e.getClass().getSimpleName()
                    + " | Сообщение: " + e.getMessage() + "\n");
        } catch (IOException ioEx) {
            System.err.println("Критическая ошибка записи лога!");
        }
    }
}
