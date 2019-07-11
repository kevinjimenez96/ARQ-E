package Computer.Utils;

import java.util.Objects;

public class Event implements Comparable<Event> {

    private EventType type;
    private long executionStart;
    private int executionDuration;

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public long getExecutionStart() {
        return executionStart;
    }

    public void setExecutionStart(long executionStart) {
        this.executionStart = executionStart;
    }

    public int getExecutionDuration() {
        return executionDuration;
    }

    public void setExecutionDuration(int executionDuration) {
        this.executionDuration = executionDuration;
    }

    @Override
    public int compareTo(Event event) {
        int cmp = 0;
        if (this.executionStart + this.executionDuration < event.getExecutionStart() + event.getExecutionDuration()) {
            cmp = -1;
        } else {
            if (this.executionStart + this.executionDuration > event.getExecutionStart() + event.getExecutionDuration()) {
                cmp = 1;
            }
        }
        return cmp;    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return executionStart == event.executionStart &&
                executionDuration == event.executionDuration &&
                type == event.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, executionStart, executionDuration);
    }
}
