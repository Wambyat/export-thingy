public class GameSummary {
    private long firstPlayed;
    private long lastPlayed;
    private int launches;
    private int playtime;

    public long getFirstPlayed() {
        return firstPlayed;
    }

    public void setFirstPlayed(long firstPlayed) {
        this.firstPlayed = firstPlayed;
    }

    public long getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(long lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public int getLaunches() {
        return launches;
    }

    public void setLaunches(int launches) {
        this.launches = launches;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }
}