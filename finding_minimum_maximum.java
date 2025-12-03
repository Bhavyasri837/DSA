import java.util.Arrays;

class methods
{
   public void finding_maximum(int[] arr)
   {
    int max=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        max=Math.max(max,arr[i]);
    }
    System.out.println("maximum:"+max);
   }
   public void finding_minimum(int[] arr)
   {
    int min=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        min=Math.min(min,arr[i]);
    }
    System.out.println("minimum:"+min);
   }
   //finding minimum and maximum elements using sorting 
   public void sortelements(int[] arr)
   {
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
           if(arr[i]>arr[j])
           {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
        }
    }
    System.out.println("Sorted array:"+Arrays.toString(arr));
    System.out.println("minimum="+arr[0]);
    System.out.println("minimum="+arr[arr.length-1]);

   }
    
}
public class finding_minimum_maximum{
    public static void main(String args[])
    {
        methods ob=new methods();
        int[] arr={3,5,6,4,14,4,2,9,10};
        ob.finding_maximum(arr);
        ob.finding_minimum(arr);
        ob.sortelements(arr);
    }
}
