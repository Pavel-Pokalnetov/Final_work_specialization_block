package AppTools.Menu;

import AppTools.CInput;

import java.util.ArrayList;

public class CMenu {
    ArrayList<MenuItem> cmenu = null;
    String header;
    Character quitliter = 'Q';
    String quitdescription = "Quit";

    public CMenu(String header) {
        this.cmenu = new ArrayList<>();
        setHeader(header);
    }

    public void addItem(Character l, String d, Runnable r) {
        cmenu.add(new MenuItem(l, d, r));
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public void setQuit(Character l, String description){
        this.quitliter = l;
        this.quitdescription = description;
    }

    public void setQuit(Character l){
        this.quitliter = l;
    }


    public void runMenu() {
        if (cmenu.isEmpty()) return;

        while (true) {
            System.out.println(this.header);
            for (MenuItem mitem : cmenu) {
                System.out.printf("%-2s %s\n", mitem.liter, mitem.description);
            }
            System.out.printf("%-2s %s\n", quitliter, quitdescription);

            char[] ansver = CInput.read(":").toCharArray();
            if (ansver.length<1 ||ansver.length>1)continue;
            if (quitliter.equals(ansver[0])) return;
            for(MenuItem m: cmenu){
                if (m.liter.equals(ansver[0])){
                    m.runmethod.run();
                }
            }
        }
    }


    private class MenuItem {
        Runnable runmethod;
        Character liter;
        String description;

        public MenuItem(Character liter, String description, Runnable runmethod) {
            this.liter = liter;
            this.description = description;
            this.runmethod = runmethod;
        }
    }
}
