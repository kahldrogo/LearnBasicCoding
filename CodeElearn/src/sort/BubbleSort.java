package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={45,23,66,2,18};
		int size=a.length;
		BubbleSort b= new BubbleSort();
		b.sort(a,size);
		
	}
	//checks adjacent elements and moves the largest to last ..repeat
	public void sort(int[] a, int size){
		
		for(int k=1;k<size-1;k++){
			boolean flag =true;
			for(int j=0;j<size-k-1;j++){
				if(a[j]>a[j+1]){
					int temp= a[j+1];
					a[j+1] =a[j];
					a[j]=temp;
					flag=false;
				}				
			}
			if(flag){
				break;
			}
		}
		
		
		for(int i=0;i<size;i++){
		System.out.println(a[i]);	
		}
		
	}

}
