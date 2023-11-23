public class IsValid {
    public boolean isValid(int given_Number){
        if(given_Number > 2_000_000_000 || given_Number  < 2){
            System.out.println("Try again" );
            return false;
        }  else return true;
    }
}

