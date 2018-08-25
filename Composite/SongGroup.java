package Patterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();

    String groupName;
    String groupDescription;

    public SongGroup(String groupName,String groupDescription){

        this.groupDescription=groupDescription;
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent){

        songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent){

        songComponents.remove(songComponent);
    }

    public SongComponent getSongComponent(int comp){

        return songComponents.get(comp);
    }

    public void displaySongInfo(){

        System.out.println(getGroupName()+" "+ getGroupDescription()+"\n");

            Iterator songIterator=songComponents.iterator();

            while(songIterator.hasNext()){

                SongComponent songInfo=(SongComponent)songIterator.next();
                songInfo.displaySongInfo();
            }
    }
}
