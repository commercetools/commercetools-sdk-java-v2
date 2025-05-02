
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldChangedMessageBuilder builder) {
        CustomerAddressCustomFieldChangedMessage customerAddressCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldChangedMessage)
                .isInstanceOf(CustomerAddressCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerAddressCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", CustomerAddressCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "previousValue",
                        CustomerAddressCustomFieldChangedMessage.builder().previousValue("previousValue") },
                new Object[] { "addressId",
                        CustomerAddressCustomFieldChangedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
