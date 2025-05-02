
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerAddressCustomFieldAddedMessagePayload customerAddressCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerAddressCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerAddressCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerAddressCustomFieldAddedMessagePayload.builder().value("value") },
                new Object[] { "addressId",
                        CustomerAddressCustomFieldAddedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldAddedMessagePayload value = CustomerAddressCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldAddedMessagePayload value = CustomerAddressCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldAddedMessagePayload value = CustomerAddressCustomFieldAddedMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
