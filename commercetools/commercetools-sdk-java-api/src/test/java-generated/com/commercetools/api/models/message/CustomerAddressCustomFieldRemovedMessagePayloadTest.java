
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldRemovedMessagePayloadBuilder builder) {
        CustomerAddressCustomFieldRemovedMessagePayload customerAddressCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldRemovedMessagePayload)
                .isInstanceOf(CustomerAddressCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerAddressCustomFieldRemovedMessagePayload.builder().name("name") },
                new Object[] { "addressId",
                        CustomerAddressCustomFieldRemovedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldRemovedMessagePayload value = CustomerAddressCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldRemovedMessagePayload value = CustomerAddressCustomFieldRemovedMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
