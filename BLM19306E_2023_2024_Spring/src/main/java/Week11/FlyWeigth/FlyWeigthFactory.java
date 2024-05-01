/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

import java.util.HashMap;

/**
 *
 * @author ali.nizam
 */
public class FlyWeigthFactory {
    HashMap<String, IColorFlyWeigth> colorStore=new HashMap<>();
    IColorFlyWeigth getColorObject(String color){
        IColorFlyWeigth colorObject= colorStore.get(color);
        if (colorObject==null){
            colorStore.put(color, new Color(color));
        }
        return colorObject;
    }
}
