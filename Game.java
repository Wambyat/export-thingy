import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Event> events;
    private String id;
    private String name;
    private GameSummary gameSummary;

    public Game(String id, String name, GameSummary gameSummary) {
        this.events = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.gameSummary = gameSummary;
    }

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

    public List<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
