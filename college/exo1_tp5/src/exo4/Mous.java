package exo4;

class mouse{
    private int Xclose = 50;
    private int Yclose = 50;
       public void mouseClick(window window,int x,int y ){
          
           if(x == Xclose && y == Yclose)
           {
               if(window.issopen()){
                   window.closeWindow();
               }
               else {
                   System.out.println("window is closed");
               }
       }   
       
   }
}
