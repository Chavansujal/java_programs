class parent
{
    void accept()
    {
    System.out.println("Hey this is parent class function !");
    }
}

class child extends parent{
    void display ()
    {
        System.out.println("this is subclass of parent class");
    }
}
class inheritance
{
    public static void main(String args[])
    {
        child c1 = new child();
        c1.accept();
        c1.display();
    }
}