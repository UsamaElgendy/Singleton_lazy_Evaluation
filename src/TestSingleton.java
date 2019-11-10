public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //get the data value
        s1.setData(100);

        System.out.println("First reference: " + s1);
        System.out.println("Singleton data value is : " + s1.getData());

        // get another reference to the singleton.
        // Is  it the same object ?

        s2.setData(200);


        System.out.println("\nSecond  reference: " + s2);
        System.out.println("Singleton data value is : " + s2.getData());


        if (s1 == s2) {
            System.out.println("Objects are the same instance");
        }


    }
}
