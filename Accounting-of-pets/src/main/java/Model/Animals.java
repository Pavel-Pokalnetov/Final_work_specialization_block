package Model;

import java.util.ArrayList;

interface Animals {
    String name = null;
    String birthdate = null;
    ArrayList<StringBuilder> commandList = null;
    void speak();
    void eat();
    void run_command(String command);
}
