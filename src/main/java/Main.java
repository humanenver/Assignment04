import java.awt.peer.SystemTrayPeer;
import java.util.*;

public class Main {
    HashMap<String, Boolean> nonDuplicateColors = new HashMap<String, Boolean>();

    public static void main(String[] args) {



        Color colors[] = new Color[12];
        colors[0] = new Color("red",true);
        colors[1] = new Color("blue",true);
        colors[2] = new Color("white",false);
        colors[3] = new Color("green",true);
        colors[4] = new Color("gray",false);
        colors[5] = new Color("orange",false);
        colors[6] = new Color("tan",false);
        colors[7] = new Color("white",false);
        colors[8] = new Color("cyan",false);
        colors[9] = new Color("peach",false);
        colors[10] = new Color("gray",false);
        colors[11] = new Color("orange",false);



        List<Color> list = Arrays.asList(colors);

       Main main = new Main();

       main.printNonDuplicates(list);









    }


//    private void createColorHashMap()


    public void printNonDuplicates(Collection<Color> values )
     {
         // create a HashSet


         Set<Color> set = new HashSet(values);

         System.out.printf("%nNonduplicates are: ");




         //System.out.println(set.toString());


         Color[] myArray = new Color[set.size()];
         set.toArray(myArray);

         for (int i = 0; i < set.size() ; i++) {




             createHashMap(myArray[i].toString());

         }



         System.out.println(nonDuplicateColors);











     }




     public void createHashMap(String color)
     {


         nonDuplicateColors.put(color,isPrimaryColor(color));


     }



     private boolean isPrimaryColor(String color)
     {


         if(color.equals("red")||color.equals("blue")||color.equals("green"))
         {
             return  true;

         }
         else
         {

            return false;
         }

     }



}
