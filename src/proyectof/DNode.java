/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectof;

/**
 *
 * @author Osiris
 */
public class DNode<T> {
    T data;
    DNode next;
    DNode back;
    
    DNode (T d){
        data = d;
        next = null;
        back = null;
    }
}
