public class Main {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("//条件2\n"+"NullPointerExceptionが発生した");
            System.out.println("//条件3\n"+e.getMessage());
        }
    }
}
