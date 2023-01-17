package roon.architecture.patterns.clean_arch.solid.srp;

import org.springframework.util.ObjectUtils;

public class OrderValidator {
    public void validateShippingAddress(String address) {
        if (ObjectUtils.isEmpty(address)) {
            throw new IllegalArgumentException();
        }
    }
}
