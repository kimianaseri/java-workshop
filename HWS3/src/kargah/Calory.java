package kargah;

public class Calory implements Sport{
    int x;



    @Override
    public void shena() {
        System.out.println("tedade harekat:"+x);
        System.out.println("calory:"+ x*6);
    }

    @Override
    public void barfkis() {
        System.out.println("tedade harekat:"+x);
        System.out.println("calory:"+ x*5);
    }

    @Override
    public void derazneshst() {
        System.out.println("tedade harekat:"+x);
        System.out.println("calory:"+ x*10);
    }

    @Override
    public void tanabzani() {
        System.out.println("tedade harekat:"+x);
        System.out.println("calory:"+ x*3);
    }

    @Override
    public void scot() {
        System.out.println("tedade harekat:"+x);
        System.out.println("calory:"+ x*4);
    }
}
