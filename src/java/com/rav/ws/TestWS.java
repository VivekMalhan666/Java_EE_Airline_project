/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rav.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Raghda
 */
@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class TestWS {
    @WebMethod
    public String sayHello(String name)
    {
        return "Hello"+name;
    }
    
}
