package com.example.project1.global;

import com.example.project1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static{
        cart = new ArrayList<Product>();
    }
}
