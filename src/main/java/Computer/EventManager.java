package Computer;

import Computer.Utils.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventManager {
    private List<Event> events;
    private int currentTick = 0;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    private static final EventManager INSTANCE = new EventManager();

    public static EventManager getInstance() {
        return INSTANCE;
    }

    public void executeEvents(int actualTime){
        Event event = this.getEvent(actualTime);

        while (event != null){
            event = this.getEvent(actualTime);
            if (event != null ){
                System.out.println("\nEvent execution at tick " + actualTime);
                event.toString();
                event.announceEventEnd();
                this.currentTick += event.getExecutionDuration();
            }else{
                System.out.println("No event at tick " + actualTime);
            }
        }

    }

    public void addEvent(Event event) {
        this.events.add(event);
        Collections.sort(this.events);
    }

    public void printEventList(){
        for (Event event : events) {
            event.toString();
        }
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public int getCurrentTick() {
        return currentTick;
    }

    public void setCurrentTick(int currentTick) {
        this.currentTick = currentTick;
    }

    private Event getEvent( int actualTime){
        Event event = null;
        for (int i = 0; i < this.events.size(); i++) {
            if (this.events.get(i).getExecutionEnd() == actualTime) {
                event = this.events.remove(i);
            }
        }
        return event;
    }
}