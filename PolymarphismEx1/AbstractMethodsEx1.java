package PolymarphismEx1;

public abstract class AbstractMethodsEx1 {
    abstract void Display();
    public void Books(){
        System.out.println("the book name is.. Core java");
    }

}
class BookWriter extends AbstractMethodsEx1{

    @Override
    void Display() {
        super.Books();
        System.out.println("the book writer is gems gosling");
    }
}
class BookPrinter{
    public static void main(String[] args) {
        BookWriter b  = new BookWriter();
        b.Display();
    }
}
