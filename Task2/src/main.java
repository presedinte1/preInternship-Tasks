public class main {

    public GrandSystem grade;

   public static GrandSystem next(GrandSystem grade){
        GrandSystem[] arr = GrandSystem.values();
        int temp;

        if ((grade.ordinal()) >= (arr.length - 1)){
            temp = 0;
        }else temp = grade.ordinal()+1;

        return arr[temp];
    }

    public static GrandSystem previous(GrandSystem grade){
        GrandSystem[] arr = GrandSystem.values();
        int temp;

        if ((grade.ordinal()) == 0){
            temp = (arr.length - 1);
        }else temp = grade.ordinal()-1;

        return arr[temp];
    }

    public static void showAll(){
        GrandSystem[] arr = GrandSystem.values();
        int temp;
        System.out.println("All the grades are:");
        for (GrandSystem t : arr) {
            System.out.println(t);
        }
        System.out.println();
    }


    public enum GrandSystem {

        BASIC,
        ACCEPTABLE,
        GOOD,
        EXCELLENT


    }

    public static void main(String[] args) {
       GrandSystem grade = GrandSystem.BASIC;
        System.out.println(next(GrandSystem.GOOD));
        System.out.println(previous(GrandSystem.GOOD));
       showAll();

        System.out.println(next(GrandSystem.BASIC));
        System.out.println(previous(GrandSystem.BASIC));

        System.out.println();
    }



}
