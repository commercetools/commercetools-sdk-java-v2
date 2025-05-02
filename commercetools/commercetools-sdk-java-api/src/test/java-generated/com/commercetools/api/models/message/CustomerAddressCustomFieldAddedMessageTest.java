
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldAddedMessageBuilder builder) {
        CustomerAddressCustomFieldAddedMessage customerAddressCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldAddedMessage)
                .isInstanceOf(CustomerAddressCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerAddressCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", CustomerAddressCustomFieldAddedMessage.builder().value("value") },
                new Object[] { "addressId", CustomerAddressCustomFieldAddedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
