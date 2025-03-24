public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Song One", "Artist A", 210);
        Song song2 = new Song("Song Two", "Artist B", 180);

        Album album = new Album("Greatest Hits", "Artist C", 0);
        album.addTrack(new Song("Track 1", "Artist C", 240));
        album.addTrack(new Song("Track 2", "Artist C", 300));

        Compilation compilation = new Compilation();
        compilation.addComposition(song1);
        compilation.addComposition(song2);
        compilation.addComposition(album);

        compilation.burnToDisk();
    }
}