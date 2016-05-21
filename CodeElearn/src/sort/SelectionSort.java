package sort;

public class SelectionSort {
	//compare first element with rest..find the lowest and swap..
	//then go to next element O(n2)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={45,23,66,2,18};
		int size=a.length;
		SelectionSort s= new SelectionSort();
		s.sort(a, size);			
		}
	
	public void sort( int[] a,int isize){
		for (int i=0;i<isize-1;i++){
			int min=i;
			for(int j=i+1;j<isize;j++)
			{
				if(a[j]<a[min]){
					min=j;
				}			
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		 for(int i=0;i<isize;i++){
			 System.out.println(a[i]);
		 }
		
	}

}
