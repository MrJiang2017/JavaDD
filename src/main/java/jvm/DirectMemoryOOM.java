package jvm;

import java.nio.ByteBuffer;

public class DirectMemoryOOM {
    private static final int ONE_MB = 1024*1024*1024;
    private static int count = 1;

    public static void main(String[] args) {
        while (true){
            ByteBuffer buffer = ByteBuffer.allocateDirect(ONE_MB);
            count++;
        }
    }
}
