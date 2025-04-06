public class Events {
    private long clockTimestamp;
    private long steadyTimestamp;
    private String type;

    //Getters and Setters
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
