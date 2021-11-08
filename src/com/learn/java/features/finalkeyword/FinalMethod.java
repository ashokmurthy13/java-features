package com.learn.java.features.finalkeyword;

public class FinalMethod extends Policy {

    /**
     * 'getPolicyNumber(String)' cannot override 'getPolicyNumber(String)' in 'com.learn.java.features.finalkeyword.Policy';
     *  overridden method is final
     */

    // overriding this method will throw the above error
    /*public String getPolicyNumber(String partyId) {
        return null;
    }*/
}
