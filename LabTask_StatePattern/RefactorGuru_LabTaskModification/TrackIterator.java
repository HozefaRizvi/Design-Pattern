package StatePattern;

import java.util.List;

public class TrackIterator {
    private List<String> playlist;
    private int currentTrack = 0;

    public TrackIterator(List<String> playlist) {
        this.playlist = playlist;
    }

    public String getCurrentTrack() {
        return playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return playlist.get(currentTrack);
    }

    public void reset() {
        currentTrack = 0;
    }
}
