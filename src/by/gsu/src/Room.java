package by.gsu.src;

import java.util.ArrayList;


public class Room  {
    private String roomName;

    private ArrayList<SortItem> roomUnits;


    public Room (String roomName){
        if (roomName == null || roomName=="") throw new IllegalArgumentException("Room Name Can't be Null");
        this.roomName = roomName;
        this.roomUnits= new ArrayList<>();
    }

    public void assignUnitToRoom(SortItem item){
        if (item==null) throw new IllegalArgumentException("Unit can't be null");
        if (!checkExistsUnit(item)) roomUnits.add(item);
    }

    public void deleteUnit(SortItem item){
        if (item==null) throw new IllegalArgumentException("Unit can't be null");
        if (checkExistsUnit(item)) roomUnits.remove(item);
    }

    public String getRoomName(){
        return roomName;
    }

    public ArrayList<SortItem> getRoomUnits(){
        return roomUnits;
    }


    private boolean checkExistsUnit(SortItem item){
        for (SortItem un : roomUnits) {
            if (un.equals(item)) return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return roomName.equalsIgnoreCase(room.roomName);

    }

    @Override
    public String toString() {
        return  roomName ;
    }
}