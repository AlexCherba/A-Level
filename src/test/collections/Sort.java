package test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Sort().go();
    }
    public void go(){
        getSongs();
        System.out.println(songList);
        RatingCompare ratingCompare = new RatingCompare();
//        Collections.sort(songList);
        Collections.sort(songList, ratingCompare);
        System.out.println(songList);
//        Collections.reverse(songList);
//        System.out.println(songList);
    }
    public void getSongs(){
        songList.add(new Song("One","Baby",4));
        songList.add(new Song("Two","Conny",8));
        songList.add(new Song("Three","Depeshmode",1));
        songList.add(new Song("Four","Kombinacia",4));
        songList.add(new Song("Five","Maroon5",5));
    }
}

class ArtistCompare implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        return o1.artist.compareTo(o2.artist);
    }
}

class RatingCompare implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {

        if (o1.rating < o2.rating) return -1;
        if (o1.rating > o2.rating) return +1;
        return 0;
    }
}
class Song implements Comparable<Song>{
    String title;
    String artist;
    int rating;

    public Song(String title, String artist, int rating){
        this.title = title;
        this.artist = artist;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating=" + rating;
    }

    @Override
    public int compareTo(Song o) {
//        return title.compareTo(o.title);
        if (this.rating < o.rating) return -1;
        if (this.rating > o.rating) return +1;
        return 0;
    }
}