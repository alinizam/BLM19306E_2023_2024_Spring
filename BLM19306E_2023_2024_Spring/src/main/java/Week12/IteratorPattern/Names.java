/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.IteratorPattern;

/**
 *
 * @author ali.nizam
 */
public class Names implements IIterator{
    String names[]={"A","B","C"};
   
    int index=0;

    @Override
    public String next() {
        if (index==names.length){
            System.out.println("Last element");
            return null;
        }
        return names[index++];
    }
    
     @Override
    public boolean hasNext() {
        return index<names.length;
    }
    
}
