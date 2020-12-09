public class Solution {  
static int countDivisibles(int arr[],  
                              int n) { 
    int res = 0; 
  
    // Iterate through these pairs 
    for (int i = 0; i  n; i++)  
    for (int j = i + 1; j  n; j++)  
// Increment count if 
  one divides other 
  if (arr[i] % arr[j] == 0 ||  
  arr[j] % arr[i] == 0)  
   res++; 
   return res; } 
  // Main 
public static void main(String[] args) 
{     int a[] = new int[]{1, 2, 3, 6, 12}; 
    int n = a.length; 
    System.out.print(countDivisibles(a, n)); } }
