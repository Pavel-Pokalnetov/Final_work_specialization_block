package Main;

import java.util.ArrayList;

public class CMenu {
    ArrayList<MenuItem> cmenu = null;
    String header;

    public CMenu(String header) {
        this.cmenu = new ArrayList<>();
        setHeader(header);
    }

    public void add(Character l, String d) {
        cmenu.add(new MenuItem(l, d));
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Character run() {
        if (cmenu.isEmpty()) return null;

        while (true) {
            System.out.println(this.header);
            for (MenuItem mitem : cmenu) {
                System.out.printf("%-2s %-10s\n", mitem.liter, mitem.description);
            }
            Character ansver = CInput.read(":").toCharArray()[0];
            if (check(ansver)) return ansver;
        }
    }

    private boolean check(Character ansver) {
        if (ansver == null) return false;
        for (MenuItem mi : cmenu) {
            if (ansver.equals(mi.liter)) return true;
        }
        return false;
    }


    private class MenuItem {
        Character liter;
        String description;

        public MenuItem(Character liter, String description) {
            this.liter = liter;
            this.description = description;
        }
    }
}
