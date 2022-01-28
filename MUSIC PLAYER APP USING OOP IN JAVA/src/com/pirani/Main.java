package com.pirani;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class Main {
    private static ArrayList<Album> Albums=new ArrayList<>();

    public static void main(String[] args) {

    Album a=new Album("Album1","shayan");
    a.Add_Song("love",3.56);
        a.Add_Song("zindagi",34.56);
        a.Add_Song("party",1.06);
        a.Add_Song("pepsi",7.96);
        a.Add_Song("araksoos",2.6);
        a.Add_Song("dose",4.56);
        Albums.add(a);
        a=new Album("Album2","Hassan");
        a.Add_Song("tum hi ho",3.56);
        a.Add_Song("cricket",34.56);
        a.Add_Song("each",1.06);
        a.Add_Song("coke",7.96);
        a.Add_Song("mazaar",2.6);
        a.Add_Song("why",4.56);
        Albums.add(a);

        LinkedList<Songs> Playlist_1=new LinkedList<>();
        Albums.get(0).AddToPlaylist("pepsi",Playlist_1);
        Albums.get(0).AddToPlaylist("araksoos",Playlist_1);
        Albums.get(0).AddToPlaylist("love",Playlist_1);
        Albums.get(1).AddToPlaylist("why",Playlist_1);
        Albums.get(1).AddToPlaylist("coke",Playlist_1);

        play(Playlist_1);
    }
    private static void play(LinkedList<Songs> PlayList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Songs> listIterator = PlayList.listIterator();

        if(PlayList.size() == 0){
            System.out.println("This playlist have no song");
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else {
                        System.out.println("no song availble, reached to the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else {
                        System.out.println("we are the first song");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("we are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("we have reached to the end of list");
                        }
                    }
                    break;

                case 4:
                    printList(PlayList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (PlayList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                                System.out.println("now playing "+listIterator.previous().toString());
                        }
                    }

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }

    private static void printList(LinkedList<Songs> playList){
        Iterator<Songs> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }

}
