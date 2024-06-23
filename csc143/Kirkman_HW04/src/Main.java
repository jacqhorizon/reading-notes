/**
 * A program to manage data for cities using a Binary Search Tree
 *
 * @author Jacq Kirkman
 * @version 1.0 May 2024
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File citiesRef = new File("src/citiesShort.txt");
            BTree cityTree = getbTree(citiesRef);

            System.out.println(cityTree.printTree());
            System.out.println("Los Angeles is a city in "+ cityTree.searchBT("Los Angeles").getState());
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File not found");
        }
    }

    private static BTree getbTree(File citiesRef) throws FileNotFoundException {
        Scanner cityScanner = new Scanner(citiesRef);

        BTree cityTree = new BTree();
        int total = cityScanner.nextInt();

        for (int i = 0; i< total; i++) {
            int population = cityScanner.nextInt();
            String[] line = cityScanner.nextLine().split(",");
            City tmp = new City(line[0].trim(), line[line.length - 1].trim(), population);
            if (line.length > 2) {
                tmp.setState(line[1].trim());
            }
            cityTree.addCity(tmp);
        }
        return cityTree;
    }
}