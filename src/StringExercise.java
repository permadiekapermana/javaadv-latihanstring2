public class StringExercise {
    // method
    public static String createString() {
        String str = "i'm in java practice";
        return str;
    }

    public static void main(String[] args) {
        String str = createString(); 

        String[] parts = str.split(" ");
        for(int i=0;i<parts.length;i++) {
            System.out.println(parts[i]);
        }
  
    }
}