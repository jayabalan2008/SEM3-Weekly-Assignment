import java.util.Arrays;
class Playlist {
    private final String[] songs;
    private int songCount;
    Playlist(int capacity) { if (capacity < 0) throw new IllegalArgumentException("capacity cannot be negative"); songs = new String[capacity]; }
    public boolean addSong(String song) {
        if (songCount == songs.length) return false;
        songs[songCount++] = song; return true;
    }
    public String[] getSongs() { return Arrays.copyOf(songs, songCount); }
    public int getSongCount() { return songCount; }
}
public class Main {
    public static void main(String[] args) {
        Playlist p = new Playlist(10); p.addSong("Song A"); p.addSong("Song B");
        String[] copy = p.getSongs(); copy[0] = "Hacked";
        System.out.println("Songs: " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}
