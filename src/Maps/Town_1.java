package Maps;

import Materials.Gravel;
import Materials.Material;
public class Town_1
{
   Material[][] map;
   int x = 15;
   int y = 30;
   public Town_1(Material[][] map)
   {
       this.map = map;
   }
   public Town_1(int x, int y)
   {
      this.makeMap();
   }
   public void makeMap()
   {
      for(int i = 0; i<map.length;i++)
      {
         for(int z = 0; z<map[i].length;z++)
         {
            map[i][z] = new Gravel(i,z);
         }
      }
   }
   public void print()
   {
      String row = "";
      for(int i = 0; i<map.length;i++)
      {
         row = "";
         for(int z =0; z<map[i].length;z++)
         {
            row = row + map[i][z].toString();
         }
         System.out.println(row);
      }
   }
}
