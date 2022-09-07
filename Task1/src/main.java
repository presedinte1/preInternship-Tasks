public class main {

    public static void main(String[] args) {


        Object values[] = new Object[6];
        values[0]= "Today is ";
        values[1]= new Person("John", "Doe", 48, 'M');
        values[2]= 32456;
        values[3]= 'a';
        values[4]= 124562.2;
        values[5]= "good day.";

        concatenateValue(values);

    }

    public static void concatenateValue(Object v[]){
        double sumNumber=0;
        String concatenateString = "";
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Integer){
               sumNumber += ((Integer) v[i]).intValue();
            }else if (v[i] instanceof String){
                concatenateString += v[i];
            }else if (v[i] instanceof Character) {
                concatenateString += v[i];
            }else if (v[i] instanceof Double) {
                sumNumber += ((Double) v[i]).doubleValue();
            }else if (v[i] instanceof Float) {
                sumNumber += ((Float) v[i]).floatValue();
            }else if (v[i] instanceof Person) {
                Person person[] = new Person[1];
                person[0] = new Person(((Person) v[i]).getFirstName(), ((Person) v[i]).getLastName(), ((Person) v[i]).getAge(), ((Person) v[i]).getGender());
            }

        }

        System.out.println(concatenateString);
        System.out.println(sumNumber);

    }

}
