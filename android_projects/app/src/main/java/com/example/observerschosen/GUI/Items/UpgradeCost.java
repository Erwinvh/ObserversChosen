package com.example.observerschosen.GUI.Items;

import java.util.LinkedList;

public class UpgradeCost {

    public LinkedList<Integer> amounts;

    public LinkedList<String> Materials;


    public UpgradeCost(LinkedList<Integer> amounts, LinkedList<String> materials) {
        this.amounts = amounts;
        Materials = materials;
    }

    public LinkedList<Integer> getAmounts() {
        return amounts;
    }

    public LinkedList<String> getMaterials() {
        return Materials;
    }
}
