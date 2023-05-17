package camp.it.shop.db;

import camp.it.shop.model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FileLoader {

    private static final FileLoader instance = new FileLoader();
    private final TiresRepository tiresRepository = TiresRepository.getInstance();
    private final UserRepository userRepository = UserRepository.getInstance();

    public void readDataFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("db.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] objectData = line.split(";");
            String[] vars = Arrays.copyOfRange(objectData, 1, objectData.length);
            switch (objectData[0]) {
                case "Tires":
                    tiresRepository.addTires(new Tires(vars));
                    break;
               case "User":
                   userRepository.addUser(new User(vars));
                   break;
                default:
                    System.out.println("Unexpected type during database loading!");
                    break;
            }
        }
        reader.close();
    }

    public void saveDataToFile() throws IOException {
        Collection<Writable> entries = new ArrayList<>();
        entries.addAll(userRepository.getUsers());
        entries.addAll(tiresRepository.getTires());
        BufferedWriter writer =
                new BufferedWriter(new FileWriter("db.csv"));
        boolean firstTime = true;
        for (Writable entry : entries) {
            String lineInFile = entry.toCSV();
            if (!firstTime) {
                writer.newLine();
            }
            firstTime = false;
            writer.write(lineInFile);
        }
        writer.close();
    }
    public static FileLoader getInstance() {
        return instance;
    }
}

