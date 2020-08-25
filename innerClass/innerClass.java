
public class innerClass {

    public static void main(String[] args) {
        outerClass obj1 = new outerClass();
        obj1.show();

        outerClass.Inner objectOfInner = new outerClass.Inner();
        objectOfInner.display();

    }
}
