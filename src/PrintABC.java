// try-catch ctrl+alt+t
public class PrintABC {
    public static void main(String[] args) throws Exception{
        //按顺序打印ABC
        Object c = new Object();
        Object a = new Object();
        Object b = new Object();
        Pf_abc pa = new Pf_abc("a",c,a);
        Pf_abc pb = new Pf_abc("b",a,b);
        Pf_abc pc = new Pf_abc("c",b,c);


        pa.start();
        Thread.sleep(1000);
        pb.start();
        Thread.sleep(1000);
        pc.start();
        Thread.sleep(1000);
    }
}

class Pf_abc extends Thread{
    private String string;
    private Object prev;
    private Object self;

    public Pf_abc(String string, Object prev, Object self){
        this.string = string;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        super.run();

        int count = 3;
        while (count > 0 ){
            synchronized (prev){
                synchronized (self){
                    System.out.println(string);
                    count--;
                    self.notifyAll();
                }
                try {
                    if (count == 0)
                        prev.notifyAll();
                    else
                        prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}