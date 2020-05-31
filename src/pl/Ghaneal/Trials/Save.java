package pl.Ghaneal.Trials;

import java.io.*;

public class Save {

    public Save(){
    }

    void save(Object o, String database) throws IOException {
        PrintWriter save = new PrintWriter(new FileWriter(database, true));
        save.println(o.toString());
        save.close();
    }
}
