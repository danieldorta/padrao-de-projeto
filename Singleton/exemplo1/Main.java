class Main {
  public static void main(String[] args) {
    //illegal construct
    //Compile Time Error: The constructor SingleObject() is not visible
    //SingleObject object = new SingleObject();

    //Get the only object available
    SingleObject s1 = SingleObject.getInstance();
    SingleObject s2 = SingleObject.getInstance();
    SingleObject s3 = SingleObject.getInstance();

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }
}
