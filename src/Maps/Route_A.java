package Maps;

import Materials.Bush;
import Materials.Gravel;
import Materials.Material;

public class Route_A
{
    public Material[][] map;
    int x = 15;
    int y = 30;
    public Route_A(Material[][] map)
    {
        this.map = map;
    }
    public void makeRoute()
    {
        for (int i = 0; i<8; i++)
        {
            for (int z = 0; z<x;z++)
            {
                map[i][z] = new Gravel(i,z);
            }
        }
        for (int i = 0;i<4;i++)
        {
            for(int z = 0;z<x;z++)
            {
                if (z<6)
                {
                    map[i][z] = new Gravel(i,z);
                }
                else
                {
                    map[i][z] = new Bush(i,z);
                }
            }
        }
        for (int i = 0; i<2; i++)
        {
            for (int z = 0; z<x;z++)
            {
                map[i][z] = new Gravel(i,z);
            }
        }
        for (int i = 0;i<4;i++)
        {
            for(int z = 0;z<x;z++)
            {
                if (z<4)
                {
                    map[i][z] = new Bush(i,z);
                }
                else
                {
                    map[i][z] = new Gravel(i,z);
                }
            }
        }
        for (int i = 0; i<6; i++)
        {
            for (int z = 0; z<x;z++)
            {
                map[i][z] = new Gravel(i,z);
            }
        }
        for (int i = 0;i<6;i++)
        {
            for(int z = 0;z<x;z++)
            {
                if (z<4)
                {
                    map[i][z] = new Gravel(i,z);
                }
                else if (z>4 && z<8)
                {
                    map[i][z] = new Bush(i,z);
                }
                else
                {
                    map[i][z] = new Gravel(i,z);
                }
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
