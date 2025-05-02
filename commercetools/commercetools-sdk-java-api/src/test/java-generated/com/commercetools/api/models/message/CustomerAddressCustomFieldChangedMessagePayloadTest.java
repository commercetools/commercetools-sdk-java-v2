
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerAddressCustomFieldChangedMessagePayload customerAddressCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerAddressCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerAddressCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerAddressCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "previousValue",
                        CustomerAddressCustomFieldChangedMessagePayload.builder().previousValue("previousValue") },
                new Object[] { "addressId",
                        CustomerAddressCustomFieldChangedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
