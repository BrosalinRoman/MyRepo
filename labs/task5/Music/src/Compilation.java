import java.util.ArrayList;
import java.util.List;

class Compilation {
    private List<MusicalComposition> compositions = new ArrayList<>();

    public void addComposition(MusicalComposition composition) {
        compositions.add(composition);
    }

    public int calculateTotalDuration() {
        return compositions.stream().mapToInt(MusicalComposition::getDuration).sum();
    }

    public void burnToDisk() {
        System.out.println("Burning compilation to disk...");
        compositions.forEach(c -> System.out.println(c.getDetails()));
        System.out.println("Total Duration: " + calculateTotalDuration() + " seconds");
    }
}
