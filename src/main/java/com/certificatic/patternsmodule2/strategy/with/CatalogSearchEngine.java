/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.strategy.with;

import java.util.ArrayList;

/**
 *
 * @author alfonso.valdez
 */
public class CatalogSearchEngine {
    
    private SortStrategy sorter;
    
    public CatalogSearchEngine(SortStrategy ss){
        this.sorter = ss;
    }
    
    public ArrayList search(){
        ArrayList list = new ArrayList();
        sorter.sort(list);
        return list;
    }
    
    public static void main(String[] args) {
        CatalogSearchEngine searchEngine = new CatalogSearchEngine(new MergeSort());
        searchEngine.search();
    }
}
