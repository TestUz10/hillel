package hanna_aleksieitseva.hw17_files.task2;

import java.util.Comparator;

public class ComparatorArea implements Comparator<House> {

    @Override
    public int compare(House h1, House h2) {
        if (h1.area == h2.area){
        return 0;
    } if (h1.area > h2.area){
        return 1;
        }
        else {
            return  -1;
        }
    }

    public void sort(ComparatorArea comparatorArea) {
    }
}
