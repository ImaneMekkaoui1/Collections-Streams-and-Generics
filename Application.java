public class Application {

    public static void main(String[] args) {

        GenericStorage<Integer> intStore = new GenericStorage<>();
        intStore.addElement(10);
        intStore.addElement(20);

        GenericStorage<String> strStore = new GenericStorage<>();
        strStore.addElement("Java");
        strStore.addElement("Generics");

        System.out.println(intStore.getElement(0));
        System.out.println(strStore.getElement(1));
    }
}
