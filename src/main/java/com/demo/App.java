package com.demo;

import java.net.*;
import com.sun.net.httpserver.*;

public class App {

public static void main(String[] args) throws Exception {

HttpServer server = HttpServer.create(
new InetSocketAddress(8080),0);

server.createContext("/", exchange -> {

String response="DevOps Pipeline Running";

exchange.sendResponseHeaders(
200,response.length());

exchange.getResponseBody()
.write(response.getBytes());

exchange.close();

});

server.start();

System.out.println("Application Started");

}

}
