package com.java7.topics;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class WatchServiceExample   {

    /**

     * This initiates the police

     */
    static WatchService  watchService;

    {
        try( WatchService watchService = FileSystems.getDefault().newWatchService();){}catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void init() {

        Path path = Paths.get("C:\\Temp\\temp\\");

        try{

            watchService= FileSystems.getDefault().newWatchService();

            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE,

                    ENTRY_MODIFY);

        } catch(IOException e) {

            System.out.println("IOException"+ e.getMessage());

        }

    }

    /**

     * The police will start making rounds

     */

    private static void doRounds() {

        WatchKey key = null;

        while(true) {

            try{

                key = watchService.take();

                for(WatchEvent<?> event : key.pollEvents()) {

                    WatchEvent.Kind<?> kind = event.kind();

                    System.out.println("Event on "+ event.context().toString() + " is " + kind);

                }

            } catch(InterruptedException e) {

                System.out.println("InterruptedException: "+e.getMessage());

            }

            boolean reset = key.reset();

            if(!reset)

                break;

        }

    }

    public static void main(String[] args) {
        init();
        doRounds();
    }
}
