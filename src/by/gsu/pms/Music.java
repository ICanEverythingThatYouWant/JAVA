package by.gsu.pms;


import java.util.Objects;

public class Music {
    private String nameProducts;
    private int soldCopy;
    private int downloadOpportunity;

    public Music(String nameProducts, int soldCopy, int downloadOpportunity) {
        super();
        this.nameProducts = nameProducts;
        this.soldCopy = soldCopy;
        this.downloadOpportunity = downloadOpportunity;
    }

    public Music() {

    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getSoldCopy() {
        return soldCopy;
    }

    public void setSoldCopy(int soldCopy) {
        this.soldCopy = soldCopy;
    }

    public int getDownloadOpportunity() {
        return downloadOpportunity;
    }

    public void setDownloadOpportunity(int downloadOpportunity) {
        this.downloadOpportunity = downloadOpportunity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return soldCopy == music.soldCopy &&
                downloadOpportunity == music.downloadOpportunity &&
                nameProducts.equals(music.nameProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts, soldCopy, downloadOpportunity);
    }

    @Override
    public String toString() {
        return "Music{" +
                "nameProducts='" + nameProducts + '\'' +
                ", soldCopy=" + soldCopy +
                ", downloadOpportunity=" + downloadOpportunity +
                '}';
    }

}