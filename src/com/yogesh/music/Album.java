package com.yogesh.music;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public Album(){

    }

    public Song  findSong(String title){

        for(Song checkedSong : songs){     //for checking song is exist or not using iterative for-loop
            if(checkedSong.getTitle().equals(title)) return checkedSong;       //checked for song exist or not
        }
        return null;

    }
    public boolean addSong(String title,double duration)
    {
        if(findSong(title) == null){                 //if findSong not present in the list then we have to add it.
            songs.add(new Song(title,duration));     // Using list add to it.
       //     System.out.println(title + " Successfully added to the List");
            return true;
        }
        else
        {
       //     System.out.println("Song with name" + title + " already exist in the List");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){   //Add song to playlist which is already exit in song list
        int index = trackNumber-1;
        if(index >0 && index<=this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
    //    System.out.println("This album does not have song with tracknumber" + trackNumber);
        return false;

    }
    public boolean addToPlayList(String title , LinkedList<Song> playList){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                playList.add(checkedSong);
            }
        }
    //    System.out.println(title+ " there is no such song in album");
        return false;
    }
}
