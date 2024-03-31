package exo4;

class window {
    private boolean isopen;
     public window (){
       this.isopen = true;
    }
    public void closeWindow(){
    this.isopen = false;
    System.out.println("window closed");
    }
    public boolean issopen(){
        if(isopen)
        System.out.println("the window is open");
        else
        System.out.println("the windso is closed");
        return isopen;
    }
}