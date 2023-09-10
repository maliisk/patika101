package java102.MakingYourOwnListClass;

class MyList<T> {

    private T[] genericArray;
    private int capacity;



    public MyList() {
        setCapacity(10);
        setGenericArray(new Object[getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setGenericArray(new Object[getCapacity()]);
    }

    public void add(T element){
        checkCapacity(1);
        getGenericArray()[size()] = element;
    }

    public void checkCapacity(int numOfElements){
        if(numOfElements > getAvailableCapacity()){
            doubleCapacity();
            checkCapacity(numOfElements);
        }
    }

    public int size(){
        int counter = 0;
        for(int i = 0; i<getCapacity();i++){
            if(getGenericArray()[i] != null){
                counter++;
            }
        }return counter;
    }

    public int getAvailableCapacity(){
        return getCapacity() - size();
    }

    public void doubleCapacity(){
        T[] tempArray = getGenericArray();

        setCapacity(getCapacity()*2);
        setGenericArray(new Object[getCapacity()]);

        int i = 0;
        for(T oldElements : tempArray){
            this.getGenericArray()[i] = oldElements;
            i++;
        }
    }

    public T get(int index){
        if(getGenericArray()[index] == null){
            return null;
        }
        T value = getGenericArray()[index];
        return value;
    }

    public void remove(int index){

        if(getGenericArray()[index] != null){
            getGenericArray()[index] = null;

            int i;
            for(i = index + 1; i == size(); i++){
                getGenericArray()[i-1] = getGenericArray()[i];
            }
        }

    }

    public void set(int index, T element){
        //If index not empty
        if(getGenericArray()[index] != null){
            //set
            getGenericArray()[index] = element;

        }
    }

    public String toString(){

        String list = "[";
        for(T element : getGenericArray()){
            if(element != null){
                list = list + element;
            }else{
                list = list + "]";
                break;
            }
        }
        return list;
    }

    public int indexOf(T element){
        int index = -1;
        for(T i : getGenericArray()){
            index++;
            if(i == element){
                return index;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element){
        int index = -1;
        int lastIndex = -1;
        for(T i : getGenericArray()){
            index++;
            if(i == element){
                lastIndex = index;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        boolean isEmpty = true; //I assumed that it is empty
        for(T element : getGenericArray()){
            if(element != null){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()];
        for(int i = 0; i < size(); i++){
            newArray[i] = getGenericArray()[i];
        }
        return newArray;
    }

    public void clear(){
        for(int i = 0; i < size(); i++){
            getGenericArray()[i] = null;
        }
    }

    public MyList<T> subList(int start,int finish){
        if(start>=0 && finish>=0){
            if(start<=this.getCapacity() && finish<=this.getCapacity()){
                int size = finish - start + 1;

                MyList<T> myList = new MyList<>(size);
                for(int i = start; i <= finish; i++){
                    myList.add(get(i));
                }
                return myList;
            }

        }return null;

    }

    public boolean contains(T data){
        boolean isContains = false;
        for (int i = 0; i <= size(); i++){
            if(getGenericArray()[i] == data){
                isContains = true;
            }
        }return isContains;
    }


    private void setGenericArray(Object[] array){
        this.genericArray = (T[]) array;

    }

    public T[] getGenericArray() {
        return this.genericArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}