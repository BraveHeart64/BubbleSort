



 class MyBubbleSort{



   void BSort(int arr[]){
	   
	   for(int i =0; i< arr.length-1; ++i){
		  for(int c =0; c<arr.length-1;++c){
			  // swap
			  if(arr[c] > arr[c+1]){
				  int temp = arr[c];
				  arr[c] = arr[c+1];
				  arr[c+1] = temp;
				  
			  }
			  
		  }
	   }
   }
   
   
   void DisplayArray(int arr[]){
	   for(int i =0 ; i<arr.length; ++i){
		   System.out.println(arr[i]);
	   }
   }

   public static void main(String[] args){
     int[] array = {10,8,6,4,3,2,1,5};
    System.out.println("My implementation of BubleSort");
	 
      MyBubbleSort bsr = new MyBubbleSort();
	  System.out.println("Unsorted Array");
	   bsr.DisplayArray(array);
	  System.out.println("Sorted Array");
	  bsr.BSort(array);
	  bsr.DisplayArray(array);
   
   
   }










}