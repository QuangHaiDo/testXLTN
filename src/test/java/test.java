import Objects.Card;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class test {

    public void showArray(ArrayList<Integer> a){
        for(int e:a){
            System.out.println(e);
        }
    }
    @Test
    public void testGenerateColor() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n=10;
        for (int i=0;i<n;i++){
            arr.add(i);
        }
        showArray(arr);
        Collections.shuffle(arr);
        System.out.println("Shuffle: ");
        showArray(arr);
    }

}
