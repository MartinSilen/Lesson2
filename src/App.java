public class App {

    public static void main(String[] args) throws Exception  {
        boolean con = false;
        do{
        try {
                System.out.println(Kek.calculator());
            con = true;
        }
        catch(Exception e){System.out.println("Invalid Value!");
        continue;
        } 

        }while (con == false);
        
    }
}
