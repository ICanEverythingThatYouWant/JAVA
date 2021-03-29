package by.gsu.src;

public class SortItem {

    private static int ItemIdCounter = 1;

    private int ItemId;

    private String ItemName;

    private int power;

    private Room room;

    private boolean PowerOn;

    public SortItem(String ItemName, int power, Room room) {
        ItemId = ItemIdCounter++;
        this.ItemName = ItemName;
        this.power = power;
        this.room = room;
    }


    public int getItemId(){
        return ItemId;
    }

    public int getItemPower (){
        return power;
    }
    public String getItemName (){
        return ItemName;
    }
    public void removeRoomFromItem(){
        room=null;
    }

    public void powerOnItem() {
        this.PowerOn = true;
    }
    public void powerOffUnit() {
        this.PowerOn = false;
    }
    public boolean isItemPoweredOn() {
        return PowerOn;
    }
    @Override
    public String toString() {
        return "Item{" +
                "ItemId=" + ItemId +
                ", ItemName='" + ItemName + '\'' +
                ", room=" + room +
                ", power=" + power +
                ", PowerOn=" + PowerOn +
                "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortItem unit = (SortItem) o;
        if (ItemId != unit.ItemId) return false;
        if (power != unit.power) return false;
        if (!ItemName.equals(unit.ItemName)) return false;
        return !(room != null ? !room.equals(unit.room) : unit.room != null);
    }
}
