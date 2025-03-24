abstract class MusicalComposition {
    private String title;
    private String artist;
    private int duration; // in seconds

    public MusicalComposition(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getDetails() {
        return title + " by " + artist + " (" + duration + " seconds)";
    }
}
