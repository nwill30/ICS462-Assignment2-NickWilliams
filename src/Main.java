import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args){

        File userDirectory = new File (System.getProperty("user.dir"));
        File inputFile = new File(String.format("%s\\%s",userDirectory.getPath(),"Asg5Data.txt"));

        ArrayList inputData = Utilities.readFileInput(inputFile);
        int[] diskCylinders = {Integer.parseInt(inputData.get(0).toString()),Integer.parseInt(inputData.get(3).toString())};
        int[] startDiskPositions = {Integer.parseInt(inputData.get(1).toString()),Integer.parseInt(inputData.get(4).toString())};
        String[] requestCylinders = {inputData.get(2).toString(),inputData.get(5).toString()};
        //List requestCylinders = Arrays.asList(inputData.get(2).toString().split(" "));


    }


}
