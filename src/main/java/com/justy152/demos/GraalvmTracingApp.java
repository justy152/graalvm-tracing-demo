package com.justy152.demos;

import java.time.Instant;

@SuppressWarnings("BusyWait")
public class GraalvmTracingApp {

   public static void main(String[] args) throws Exception {
      Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.printf("%s: Graalvm Tracing App is shutting down...%n", Instant.now())));

      while(!Thread.currentThread().isInterrupted()) {
         System.out.printf("%s: Graalvm Tracing App is running...%n", Instant.now());
         Thread.sleep(5000);
      }
   }
}
