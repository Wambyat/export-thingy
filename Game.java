import java.util.List;

public class Game {
    private List<Events> events;
    private String id;
    private String name;
    private GameSummary gameSummary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameSummary getSummary() {
        return gameSummary;
    }

    public void setSummary(GameSummary summary) {
        this.gameSummary = summary;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void addEvent(Events event) {
        this.events.add(event);
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }
}
