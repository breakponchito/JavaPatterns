/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.observer.without;

/**
 *
 * @author alfonso.valdez
 */
public class FaultMessageGenerator {
    public void faulted(){
        FaultLogger logger = new FaultLogger();
        FaultMailer mailer = new FaultMailer();
        Fault faultObject = new Fault();
        String msg = "notify";
        logger.log(faultObject, msg);
        mailer.send(faultObject, msg);
    }
}
