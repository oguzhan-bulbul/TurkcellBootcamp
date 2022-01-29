
public class MyArrayList<T> {
	
	private T[] temporaryArray = (T[]) new Object[0];
    int counter = 0;
    public MyArrayList() {
    }

    public void add(T item){

        if(this.temporaryArray.length==0){
            temporaryArray= (T[]) new Object[counter+1];
            temporaryArray[counter]=item;
        }
        else {
            counter = temporaryArray.length;
            temporaryArray= (T[]) new Object[counter+1];
            temporaryArray[counter]=item;
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
	

}
