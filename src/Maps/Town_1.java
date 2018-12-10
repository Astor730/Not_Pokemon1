package Maps;

import Materials.Gravel;
public class Town_1
{
   Gravel[][] map;
   int x;
   int y;
   public Town_1(int x, int y)
   {
       this.x = x;
       this.y = y;
   }
   public void makeMap()
   {
       map = new Gravel[x][y];
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
