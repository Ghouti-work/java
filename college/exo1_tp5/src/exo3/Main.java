package exo3;

class MessageSubject {
    public void notifyObservers(String message) {
        Observer1 observer1 = new Observer1("Observer 1",message);
        Observer2 observer2 = new Observer2("Observer 2");
        Observer3 observer3 = new Observer3("Observer 3");
        
        observer1.update(observer2,observer3);
    }
}

class Observer1 {
    private String name;
    private String message;

    public Observer1(String name, String message) {
        this.name = name;
        this.message = message;
    }
    public void update(Observer2 observer2,Observer3 observer3)
    {
        System.out.println(name + " received message: " + message);
        observer2.update(message,observer3);
    }
}

class Observer2 {
    private String name;

    public Observer2(String name) {
        this.name = name;
    }
    public void update(String message,Observer3 observer3 ) {
        System.out.println(name + " received message: " + message);
        observer3.update(message);
    }
}

class Observer3 {
    private String name;

    public Observer3(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSubject messageSubject = new MessageSubject();

        messageSubject.notifyObservers("Hello, observers!");
    }
}
