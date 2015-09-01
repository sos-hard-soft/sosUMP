/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.helpers;

/**
 *
 * @author mabsalhi.sos
 */
public class Casting {

    public Casting() {
    }
    
    
        public java.lang.Long ConvertToLong(String value) {
            java.lang.Long valueConverted;
            valueConverted = Long.valueOf(value);
            return valueConverted;
        }
}
