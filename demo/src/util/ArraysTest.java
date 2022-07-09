package day6;

public class ArraysTest {

	public static void asc(int[] num){
		int temp;
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-1-i;j++){
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			
	}

	}
	public static void desc(int[] num){
		int temp;
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-1-i;j++){
				if(num[j]<num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
	}
		
	}
}
