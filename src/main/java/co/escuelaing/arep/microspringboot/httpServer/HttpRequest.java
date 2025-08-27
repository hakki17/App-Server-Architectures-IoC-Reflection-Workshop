/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.escuelaing.arep.microspringboot.httpServer;

import java.net.URI;

/**
 *
 * @author maria.sanchez-m
 */
public class HttpRequest {
    
    URI requri = null;

    HttpRequest(URI requri) {
        this.requri = requri;
    }

    public String getValue(String paramName) {
        
        //Extrae el valor de paramName desde el query.
        String paramValue = requri.getQuery().split("=")[1]; //Ejemplo: /app/hello?name=jhon
        return paramValue;
    }

}
