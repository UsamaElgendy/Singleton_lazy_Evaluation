public class Singleton {

    //private static refrence to to the one only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /*
     *The Singleton contractor
     * Note that is private
     * No client can instantiate a singleton object
     *  */
    private Singleton() {
    }

    // Create the get instance method that's going to return our unique instance
    // the problem with thread
    public static Singleton getInstance() {

        //first check if the unique instance is equal to null
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }
    // add a set data here
    public void setData(int myData) {
        data = myData;
    }
    public int getData(){
        return data;
    }

}
