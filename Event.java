public class Event {
    private long clockTimestamp;
    private long steadyTimestamp;
    private String type;

    public Event(long clockTimestamp, long steadyTimestamp, String type) {
        this.clockTimestamp = clockTimestamp;
        this.steadyTimestamp = steadyTimestamp;
        this.type = type;
    }

    public long getClockTimestamp() {
        return clockTimestamp;
    }

    public void setClockTimestamp(long clockTimestamp) {
        this.clockTimestamp = clockTimestamp;
    }

    public long getSteadyTimestamp() {
        return steadyTimestamp;
    }

    public void setSteadyTimestamp(long steadyTimestamp) {
        this.steadyTimestamp = steadyTimestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
