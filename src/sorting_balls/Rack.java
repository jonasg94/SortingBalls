/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_balls;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author joaogomes
 */
public class Rack {
     private List<Integer> balls;

    public Rack() {
        this.balls = new ArrayList<Integer>();
    }

    public List getBalls() {
        return balls;
    }

    public void setBalls(List balls) {
        this.balls = balls;
    }
    
    public int add_balls(Integer a){
        if( a < 0 || a>59){
            System.out.println("We are programmers so the balls are numbered 0 to 59 ");
            return -1;
        }
        for(Integer aux : balls){
            if(aux.equals(a)){
                System.out.println("This ball are in the combinnation alredy");
                return -2;
            }            
        }
        balls.add(a);
        return 0;

    }
    
    public void sorting_bubblesort(){
       // para ordenar estou a usar o algoritmo bubble sort, que percorre o algoritmo várias vezes
       
       int aux = 0;
       
       for(int i = 0 ; i < balls.size(); i++){
           for(int j =0; j< balls.size()-1; j++){
               if(balls.get(j) > balls.get(j+1)){
                   aux = balls.get(j);
                   balls.set(j, balls.get(j+1));
                   balls.set(j+1,aux);
               }
           }
    }
    }
    
    public void quick_sort(int low, int high){
        // ordenamento de frorma recursiva usando o algoritmo quick_sort
        int i = low, j = high;
        
        int pivot = balls.get((high-low)/2);
        //pegamos no valor do meio para nao cairmos no pior caso do quick_sort que é quanto o array esta ordenado ou inversamente ordenado 
        
        while(i <= j){
                while (balls.get(i) < pivot) {
				i++;
			}
 
			while (balls.get(j) > pivot) {
				j--;
			}
 
			if (i<j) {
				int temp = balls.get(i);
                                balls.set(i,balls.get(j));
                                balls.set(j, temp);
				i++;
				j--;
			}
		}
 		if (low < j)
			quick_sort(low, j);
 
		if (high > i)
			quick_sort(i, high);
	}        
    
}
