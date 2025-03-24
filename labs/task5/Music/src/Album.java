import java.util.ArrayList;
import java.util.List;

class Album extends MusicalComposition {
    private List<MusicalComposition> tracks = new ArrayList<>();

    public Album(String title, String artist, int duration) {
        super(title, artist, duration);
    }

    public void addTrack(MusicalComposition track) {
        tracks.add(track);
    }

    public int getTotalDuration() {
        return tracks.stream().mapToInt(MusicalComposition::getDuration).sum();
    }
}
