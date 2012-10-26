/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import strategy.*;
import tree.BinaryTree;
import tree.Node;

/**
 *
 * @author Babu
 */
public class Main {
    
    public static void serachMain(String[] args){
        ITreeStrategy strategy;
        String strategyName,key;

        try {
            strategyName = args[0];
            key=args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Must choose a strategy and type a key");
            return;
        }
        switch (strategyName) {
            case "DFS":
                strategy = new DFSStrategy<>(new VerboseStack<Node>());
                break;
            case "BFS":
                strategy = new BFSStrategy(new VerboseFifo<Node>());
                break;
            default:
                System.out.println("No valid strategy name");
                return;
        }

        BinaryTree<String, TestClass> myBinaryTree = new BinaryTree<>(strategy);
        filltree(myBinaryTree);
       
        System.out.println("FIND choosen strategy is "+strategyName+"=========");
        Node n = myBinaryTree.find(key);
        System.out.println("RESULT============================================");
        if (n != null) {
            System.out.println("For key:\"" + key + "\" was found this node");
            System.out.println(n);
        } else {
            System.out.println("No result found.");
        }
    }
    

    public static void printMain(String[] args){
        ITreeStrategy strategy;
        String strategyName;

        try {
            strategyName = args[0];            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Must choose a strategy as an argument.");
            return;
        }
        switch (strategyName) {
            case "DFS":
                strategy = new DFSStrategy<>();
                break;
            case "BFS":
                strategy = new BFSStrategy<>();
                break;
            default:
                System.out.println("No valid strategy name");
                return;
        }

        BinaryTree<String, TestClass> myBinaryTree = new BinaryTree<>(strategy);
        filltree(myBinaryTree);         
        System.out.println("PRINTING: "+strategyName);
        myBinaryTree.print();        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // serachMain(args);
        printMain(args);
    }

    private static void filltree(BinaryTree<String, TestClass> myBinaryTree) {
        myBinaryTree.add("a", new TestClass(1, "jednicka"));
        myBinaryTree.add("e", new TestClass(2, "dvojka"));
        myBinaryTree.add("g", new TestClass(3, "trojka"));
        myBinaryTree.add("ble", new TestClass(4, "ctyrka"));
        myBinaryTree.add("bum", new TestClass(5, "petka"));
        myBinaryTree.add("hgs", new TestClass(6, "sestka"));
        myBinaryTree.add("fuj", new TestClass(7, "sedmicka"));
        myBinaryTree.add("b", new TestClass(8, "osmicka"));
        //myBinaryTree.helpPrintRecursiveTree();
        //System.out.println("");
    }
}
