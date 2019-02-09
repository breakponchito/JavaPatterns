/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.observer.with;

import java.util.ArrayList;
import com.certificatic.patternsmodule2.observer.without.Fault;

/**
 *
 * @author alfonso.valdez
 */
public class FaultMessageGenerator {

    private ArrayList<FaultListener> listeners = new ArrayList<FaultListener>();

    public void addFaultListener(FaultListener listener) {
        listeners.add(listener);
    }

    protected void notifyListeners(Fault faultObj, String msg) {
        for (FaultListener listener : listeners) {
            listener.faultEvent(faultObj, msg);
        }
    }

    public void removeFaultListener(FaultListener listener) {
        listeners.remove(listener);
    }

    public static void main(String[] args) {
        FaultMessageGenerator messageGenerator = new FaultMessageGenerator();
        messageGenerator.addFaultListener(new FaultLogger());
        messageGenerator.addFaultListener(new FaultMailer());
        messageGenerator.addFaultListener(new FaultPager());
        messageGenerator.notifyListeners(new Fault(), "My message");
    }
}
