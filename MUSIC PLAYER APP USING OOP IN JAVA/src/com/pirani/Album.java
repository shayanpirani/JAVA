package com.pirani;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
       private String Name;
       private String Artist;
       private ArrayList<Songs> Songs;

    public Album(String name, String artist) {
        Name = name;
        Artist = artist;
        Songs = new ArrayList<Songs>();
    }
    public Album()
    {

    }

    public Songs findSong(String Title)
    {
        for(Songs checkedSong: Songs)     //Enhanced For loop
        {
                if(checkedSong.Name().equals(Title))
                {
                    return checkedSong;
                }
        }
        return null;
    }

    public Boolean Add_Song(String Title,double Duration)
    {
        if(findSong(Title)==null)
        {
            Songs.add(new Songs(Title,Duration));
            System.out.println("Song Successfully Added To the list");
            return true;
        }
        else{
            System.out.println("Song with name"+ Title+ " already Exist in the Album");
            return false;
        }

    }

    public Boolean AddToPlaylist(int trackNumber, LinkedList<Songs>Playlist)
    {
        int index=trackNumber-1;
        if(index>0 && index>=this.Songs.size())
        {
            Playlist.add(this.Songs.get( index));
            return true;
        }
        System.out.println("This album does not have song with this track number");
        return false;

    }

    public Boolean AddToPlaylist(String Title,LinkedList<Songs>Playlist)
    {
        for(Songs checkedSong:this.Songs) {
            if (checkedSong.Name().equals(Title)) {
                Playlist.add(checkedSong);
                return true;
            }
        }
            System.out.println("There is no such song in the Album");
            return false;


    }
}
