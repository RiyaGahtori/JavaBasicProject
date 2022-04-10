 package Unit_01;

 /* Tasks given below:
	obj.sortAnArray(array);
	obj.findTheDuplicateElements(array);
	obj.findSecondLargestAndSecondSmallestElement(array);
	obj.leftRotationInAnArray(array); 
	obj.removeElementInArray(array);//(Optional)
*/

public class P9_Array {

public static void main(String[] args) {

	int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

	QuestionsOnArray obj = new QuestionsOnArray();
	obj.sortAnArray(array);
	obj.findTheDuplicateElements(array);
	obj.findSecondLargestAndSecondSmallestElement(array);
	obj.leftRotationInAnArray(array);
	obj.removeElementInArray(array,4); // (Optional)

}

}

class QuestionsOnArray {

void sortAnArray(int[] arr) {
	
	for(int i=1;i<arr.length;i++)
	{
		int key=arr[i];
		int j=i-1;
		while(arr[j]>key && j>=0)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
		
	}
	
	System.out.println("Sorted Array:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.print("\n");
	
}

void findTheDuplicateElements(int[] arr1) {
	int arr[]= new int[arr1.length];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=arr1[i];
	}
	

	System.out.println("Duplicate Elements:");
	for(int i=0;i<arr.length;i++)
	 {
		 int check=0;
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]==arr[j] && arr[i]!=-1)
			 {
				 if(check==0)
				 {
					 check=1;
					 System.out.print(arr[i]+" ");
					 
				 }
				 
					 arr[j]=-1;
				 
			 }
			 
			 
		 }
	 }
	System.out.println();

}

void findSecondLargestAndSecondSmallestElement(int[] arr) {
	
	int min=arr[0];
	int max=arr[0];
	
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		else if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	
	int smax=min;
	int smin=max;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>smax && arr[i]!= max )
		{
			smax=arr[i];
		}
		if(arr[i]<smin && arr[i]!=min)
		{
			smin=arr[i];
		}
	}
	
	System.out.println("Second largest element:"+smax+"\nSecond smallest element:"+min);
	

}

void leftRotationInAnArray(int[] arr) {
	 int temp;
     temp = arr[0];
     for (int i = 0; i < arr.length- 1; i++)
         arr[i] = arr[i + 1];
     arr[arr.length-1] = temp;
     System.out.println("After left rotation:");
 	for(int i=0;i<arr.length;i++)
 	{
 		System.out.print(arr[i]+" ");
 	}
 	System.out.print("\n");
     
}

void removeElementInArray(int[] arr,int key) {
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
			arr[i]=-1;
			break;
		}
	}
	System.out.println("After deletion of "+key+ "(-1 represents deletion)");
	for(int i=0;i<arr.length;i++)
 	{
 		System.out.print(arr[i]+" ");
 	}
 	System.out.print("\n");
}

}