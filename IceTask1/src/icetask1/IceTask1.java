/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1;

import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class IceTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         boolean loop = true;
        while (loop == true){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("\n\nPick an Animal between \n"
                + "     [Bird]  and [Reptile]");
        String Input = kb.nextLine();

        
        
       
        if (Input.equals("Bird")) {
            
             Bird brd = new Bird();
            System.out.println("Species");          
            System.out.println(" [From Bird Class (Sub class)]  " + brd.getOstrich());
            System.out.println(" [From Bird Class (Sub class)]  " + brd.getDove());
            System.out.println(" [From Bird Class (Sub class)]  " + brd.getChicken());
                        
            System.out.println("Colour");
           System.out.println(" [From Bird Class (Sub class)]  " + brd.getGrey() + " = Grey ");
           System.out.println(" [From Bird Class (Sub class)]  " + brd.getWhite() + " = White ");
           System.out.println(" [From Bird Class (Sub class)]  " + brd.getBlack() + " = Black ");
           
            loop = true;
            
        } else if (Input.equals("Reptile")) {
            
             Reptile rept = new Reptile();
            System.out.println("Species");
            System.out.println(" [From Reptile Class (Sub class)]  " + rept.getLizard());
            System.out.println(" [From Reptile Class (Sub class)]  " + rept.getSnake());
            System.out.println(" [From Reptile Class (Sub class)]  " + rept.getBeardedDragon());
           
            
            System.out.println("Blood Temperature");
            System.out.println(" [From Reptile Class (Sub class)]  " + rept. getBloodTemperature() +" degrees celsius");
              loop = true;
            
        } else {
            System.out.println("Invalid");
              loop = true;
        }
        
        }
    }// main

        
        
    public static class Animal {
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        int IDtag;
        String Species;

        public int getIDtag() {
            return IDtag;
        }

        public void setIDtag(int IDtag) {
            this.IDtag = IDtag;
        }

        public String getSpecies() {
            return Species;
        }

        public void setSpecies(String Species) {
            this.Species = Species;
        }
    } // Animal class

   

} // IceTask1 class