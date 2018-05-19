//对象有锁

public class ThreadPrint {
    public static void main(String[] args) {
        Student student = new Student("dr");
        Thread1 thread1 = new Thread1(student);
        Thread2 thread2 = new Thread2(student);
        //start线程才运行
        thread1.start();
        thread2.start();
    }
}
//学生类，内部类
class Student{
    private String name;
    //构造方法，同类名一样，有参数。
    public Student(String name){
        this.name = name;
    }
}
class Thread1 extends Thread{
    private Student student;
    public Thread1(Student student){
        this.student = student;
    }

    @Override
    public void run() {
        super.run();
        //print 1-52
        //在idea中添加try/catch的快捷键   ctrl+alt+t
        synchronized (student){
            for (int i = 1; i <53 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                if (i % 2 == 0){
                    student.notifyAll();
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Thread2 extends Thread{
    private Student student;
    public Thread2(Student student){
        this.student = student;
    }

    @Override
    public void run() {
        super.run();
        synchronized (student){
            for (int j = 0; j < 26; j++) {
                System.out.println(Thread.currentThread().getName()+":"+(char)('A'+j));
                student.notifyAll();
                try {
                    student.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}