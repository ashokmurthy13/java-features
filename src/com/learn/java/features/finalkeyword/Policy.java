package com.learn.java.features.finalkeyword;

public class Policy {

    final public String getPolicyNumber(String partyId) {
        String policyId = "POL1001";
        if (partyId.equalsIgnoreCase("10001")) {
            return policyId;
        }
        return "TEST1001";
    }
}
