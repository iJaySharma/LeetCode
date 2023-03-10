//two Pointes

import java.io.*;
import java.util.*;

class Solution{
static void printIntervals(int arr1[][],
                           int arr2[][])
{
     
   
    int i = 0, j = 0;
     
    int n = arr1.length, m = arr2.length;
     
    
    while (i < n && j < m)
    {
         
        
        int l = Math.max(arr1[i][0], arr2[j][0]);
 
        
        int r = Math.min(arr1[i][1], arr2[j][1]);
         
       
        if (l <= r)
            System.out.println("{" + l + ", " +
                                 r + "}");
 
        
        if (arr1[i][1] < arr2[j][1])
            i++;
        else
            j++;
    }
}
 
public static void main(String[] args)
{
    int arr1[][] = { { 0, 4 }, { 5, 10 },
                     { 13, 20 }, { 24, 25 } };
 
    int arr2[][] = { { 1, 5 }, { 8, 12 },
                     { 15, 24 }, { 25, 26 } };
 
    printIntervals(arr1, arr2);
}
}

//Time Complexity O(m+n)