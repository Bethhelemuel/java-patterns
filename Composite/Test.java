package Patterns.Composite;

public class Test {

    public static void main(String[] args){

        SongComponent hipHop= new SongGroup("Hip Hop","Hip hop music has beats and sick lines");
        SongComponent pop= new SongGroup("Pop","Makes alot of money in its industry");

        SongComponent everySong= new SongGroup("Song List","EverySong");

        everySong.add(hipHop);

        hipHop.add(new Song("Flyer", "OVO" ,2018));
        hipHop.add(new Song("Upset", "OVO" ,2017));
        hipHop.add(new Song("headHuncho", "OVO" ,2015));


        hipHop.add(pop);

        DiscJockey hip= new DiscJockey(everySong);

        hip.getSongList();
    }

}
