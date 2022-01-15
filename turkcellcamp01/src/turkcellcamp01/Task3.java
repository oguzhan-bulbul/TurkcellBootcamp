package turkcellcamp01;

public class Task3 {

	public static void main(String[] args) {
		int sayi = 2;
		int count1 =0;
		int count2 =0;
		int k=0;
		while(k<3){
			for(int i=1;i<sayi;i++){
				if(sayi%i==0){
					count1+=i;
				}			
			}
			for(int j=1;j<count1;j++){
				if(count1%j==0){
					count2+=j;
				}
			}
			if(count2==sayi && sayi!=count1&& sayi<count1){
				System.out.println(sayi+" " + count1);
				k++;
			}
			sayi++;
			count1=0;
			count2=0;		
		}

	}

}
