package by.gsu.pms;

import by.gsu.pms.Music;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        Music[] musicList = {
                new Music("thirty years", 500000, 450),
                null,
                new Music("Fog", 450230, 350),
                new Music("Bum", 375321, 400),
                new Music("Your call", 600250, 615),
                new Music("Lyrics", 550125, 518),
                new Music("Java", 351356, 225),
                new Music("Dirty blood", 754213, 688),
                new Music("My death", 495129, 501),
                new Music("Life", 888842, 755),
        };

        List<Music> musics = Arrays.asList(musicList);

        System.out.println("sort by copy");
        sortCollectionByCopy(musics).forEach(System.out::println);

        System.out.println("sort by name");
        sortCollectionByName(musics).forEach(System.out::println);

        System.out.println("calculate sum");
        System.out.println(countSum(musics));

        System.out.println("calculate download opportunity");
        System.out.println(countDownloadOpportunity(musics));
    }

    private static Integer countSum( List<Music> musics){
        return musics.stream()
                .filter(x -> x != null)
                .mapToInt(Music::getSoldCopy).sum();
    }

    private static Integer countDownloadOpportunity( List<Music> musics){
        return musics.stream()
                .filter(x -> x != null)
                .mapToInt(Music::getDownloadOpportunity).sum();
    }

    private static ArrayList sortCollectionByCopy(List list){
        return  (ArrayList) list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Music::getSoldCopy))
                .collect(Collectors.toList());
    }

    private static ArrayList sortCollectionByName(List list){
        return  (ArrayList) list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Music::getNameProducts))
                .collect(Collectors.toList());
    }
}