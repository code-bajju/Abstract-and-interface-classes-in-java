public abstract class abstact_method {
//Non abstract method 
  void Show() {
    System.out.println("this is non abstracted method");
  }
  //abstract method
  abstract void run();
}
class Main extends abstact_method {
  void run() {
    System.out.println("this is Abstract Method");
  }
  public static void main(String[] args) {
    Main sc = new Main(); //object is provided by the method
    Main obj = new Main();//object is provided by the method
    obj.Show();
    sc.run();
  }
}