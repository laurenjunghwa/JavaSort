public class Array
{
    public static void main(String [] args)
    {
        int x [] = {1,3,5,6,8};
    }
    
    public int [] selectionSort(int arr[])
    {
        for (int x = 0; x < arr.length - 1; x++)
        {
            int index = x;
            int count = 0;
            for (int y = x + 1; y < arr.length; y++)
            {
                if (arr[y] < arr[index])
                    index = y;
            }
            int smallerNumber = arr[index]; 
            arr[index] = arr[x];
            arr[x] = smallerNumber;
            count++;
            print(arr);
            
            /*for(int z: arr)
            {
                System.out.println(x);
            }
            */
        }
        
        return arr;
    }
    
    public int [] print(int num[])
    {
        return num;
    }
    
    public int [] insertionSort(int num[])
    {
        
        return num;
    }
}
