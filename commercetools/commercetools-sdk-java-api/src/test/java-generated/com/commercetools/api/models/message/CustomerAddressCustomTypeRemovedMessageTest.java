
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomTypeRemovedMessageBuilder builder) {
        CustomerAddressCustomTypeRemovedMessage customerAddressCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeRemovedMessage)
                .isInstanceOf(CustomerAddressCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "previousTypeId",
                        CustomerAddressCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { "addressId",
                        CustomerAddressCustomTypeRemovedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerAddressCustomTypeRemovedMessage value = CustomerAddressCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomTypeRemovedMessage value = CustomerAddressCustomTypeRemovedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
