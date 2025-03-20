package sample;

class Engine{
    void start(){
        System.out.println("engine is starting");
    }
}

class car{
    Engine e = new Engine();
    
    void stop(){
        System.out.println("engine is stoping");
        e.start();
        
    } 
      void moving(){
    System.out.println("Engine is moving..");
    e.moving();
  }
}


public class Composition{
  public static void main(String[] args){
    Car c = new Car();
    c.stop();
    c.moving();
  }
}