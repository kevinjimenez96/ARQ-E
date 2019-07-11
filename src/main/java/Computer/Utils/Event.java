package Computer.Utils;

public class Event {

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
}
