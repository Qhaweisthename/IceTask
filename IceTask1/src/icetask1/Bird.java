/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

/**
 *
 * @author ngcon
 */
public class Bird extends IceTask1 {
    private String dove;
    private String ostrich; // Corrected variable name
    private String chicken; // Corrected variable name

    public String getDove() {
        return "Dove";
    }

    public void setDove(String dove) {
        this.dove = dove;
    }

    public String getOstrich() {
        return "Ostrich";
    }

    public void setOstrich(String ostrich) {
        this.ostrich = ostrich;
    }

    public String getChicken() {
        return "Chicken";
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

   
       private int grey = 1;
       private int white = 2;
         private int black = 3;

        public int getGrey() {
            return grey;
        }

        public void setGrey(int grey) {
            this.grey = grey;
        }

        public int getWhite() {
            return white;
        }

        public void setWhite(int white) {
            this.white = white;
        }

        public int getBlack() {
            return black;
        }

        public void setBlack(int black) {
            this.black = black;
        }
     
    }
