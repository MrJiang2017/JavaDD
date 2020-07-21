package jvm;

public class StackOOM {
    private int stackDep = 1;
    public void stackLeak(){
        stackDep++;
        System.out.println("------"+stackDep);
        stackLeak();
    }

    public static void main(String[] args) {
        StackOOM stackOOM = new StackOOM();
        try {
            stackOOM.stackLeak();
        }catch (Exception e){
            System.out.println("......"+stackOOM.stackDep);
            e.printStackTrace();
        }
    }
}
