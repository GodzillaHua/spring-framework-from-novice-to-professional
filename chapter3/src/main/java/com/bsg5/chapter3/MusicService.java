package com.bsg5.chapter3;

import java.util.List;

/**
 * @author huawei
 **/
public interface MusicService {
    List<Song> getSongsForArtist(String artist);
    List<String> getMatchingSongNamesForArtist(String artist, String prefix);
    List<String> getMatchingArtistNames(String prefix);
    Song getSong(String artist, String name);
    Song voteForSong(String artist, String name);
}
