import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReadDataOpenCSV readDataOpenCSV = new ReadDataOpenCSV(settings.getValue("foreign_names.path"));
        PrintStream fileOut = new PrintStream("./output.txt");
        System.setOut(fileOut);
        System.out.println(readDataOpenCSV.getPersonLinkedList().toString());

    }
}