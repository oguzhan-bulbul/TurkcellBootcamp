
public class MyArrayList<T> {
	
	private T[] temporaryArray = (T[]) new Object[0];
    int counter = 0;
    public MyArrayList() {
    }

    public void add(T item){

        if(this.temporaryArray.length==0){
           temporaryArray= (T[]) new Object[temporaryArray.length+1];
            temporaryArray[0]=item;
            
        }
        else {
            counter = temporaryArray.length;
            T[] temporaryArray2 = temporaryArray.clone();
            temporaryArray = (T[]) new Object[temporaryArray2.length+1];
            for(int i=0;i<temporaryArray2.length;i++) {
            	temporaryArray[i]=temporaryArray2[i];
            }
            temporaryArray[temporaryArray.length-1]=item;
            
        }
    }

    public void remove(int index){
        T[] temporaryArray2= (T[]) new Object[counter];
        int i = 0;
        for(i = 0; i<temporaryArray.length;i++){
            if(index==i){break;}
            temporaryArray2[i]=temporaryArray[i];

        }

        int j;
        for(j=i; j<temporaryArray2.length;j++){
            temporaryArray2[j]=temporaryArray[j+1];
        }
        temporaryArray = temporaryArray2;

    }


    public int size(){
    return temporaryArray.length;
    }
    
    public void getValue() {
    	for(T t : temporaryArray) {
    		System.out.println(t);
    	}
    }
	

}
