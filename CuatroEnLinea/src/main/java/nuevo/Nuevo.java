/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Nuevo 
{
    public static void main(String[] args)
    {
        /*
        List<Integer> list_hija = new ArrayList<>();
        list_hija.add(1);
        list_hija.add(2);
        list_hija.add(3);
        list_hija.add(4);
        list_hija.add(5);
        list_hija.add(6);
        list_hija.add(7);
        list.addAll(list_hija);
        */
        Persona persona1 = new Persona("Diego", 80);
        Persona persona2 = new Persona("Daniela", 90);
        
       /*
        
        List<Integer> list = new ArrayList<>();
        
        list.add(14);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        list.add(0, 900);
        
        System.out.println(list.get(3));
        System.out.println(list.isEmpty());
        
        System.out.println("------------------------------------------------");
        
        
        
        System.out.println(list.contains(30));

        for(int i = 0 ; i <= list.size()-1; i++)
        {
            System.out.println(list.get(i));
        }
        
        */ 
        
        List<Persona> personas = new ArrayList<>();
        
        personas.add(persona1);
        personas.add(persona2);
        
        for (int i = 0; i < personas.size(); i++) 
        {   
            Persona persona = personas.get(i);
            System.out.println(persona.edad + "" + persona.nombre);
        }
        
        
    }
}
