package Log;

import java.util.ArrayList;

public class MemoryLog implements Log {
    ArrayList<Event> events = new ArrayList<>();

    @Override
    public void printLogs() {
        if (events.size() == 0) {
            System.out.println("no logs exist yet");
            System.out.println();
            return;
        }
        for (Event e : events) {
            System.out.println(e.toString() + '\n');
        }
    }

    @Override
    public void addEvent(Event e) {
        events.add(e);
    }
}
