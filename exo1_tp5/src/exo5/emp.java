package exo5;

public class emp {
	
	    public String type ;
	    public emp(){
	        type = "emploiyee";
	    }
	    
	    public void Type(){
	        type ="original grade  " + type;
	        System.out.println(type);
	    }
	    public void up(emp object,String type1){
	        type = "new grade  "+ type1;
	        System.out.println(type);
	    }
}
