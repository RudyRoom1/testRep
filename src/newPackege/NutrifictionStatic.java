package newPackege;

public class NutrifictionStatic {
    private static int servings;
    private static int servingSize;

    private NutrifictionStatic() {
        System.out.println("NutrifictionStatic");
    }

    public static NutrifictionStatic createInstanceOfNutr() {
        return new NutrifictionStatic();
    }

//    public void setServingSize(int servingSize) {
//        this.servingSize = servingSize;
//    }
//
//    public void setServings(int serving) {
//        this.servings = serving;
//    }
}
