package org.jctools.samples;

import java.util.Queue;

import org.jctools.queues.MpscChunkedArrayQueue;

public class MainUsingMpscChunked {

    public static void main(String[] args) {
        Queue<Integer> q = new MpscChunkedArrayQueue<>(1024, 8*1024, true);
        // fill up the queue
        int i = 0;
        while(q.offer(i)) i++;
        System.out.println("Added "+ i);
        // empty it
        i = 0;
        while(q.poll() != null) i++;
        System.out.println("Removed "+ i);
    }

}
