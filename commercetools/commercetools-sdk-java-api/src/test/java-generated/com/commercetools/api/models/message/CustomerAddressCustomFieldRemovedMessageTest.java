
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomFieldRemovedMessageBuilder builder) {
        CustomerAddressCustomFieldRemovedMessage customerAddressCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldRemovedMessage)
                .isInstanceOf(CustomerAddressCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerAddressCustomFieldRemovedMessage.builder().name("name") }, new Object[] {
                        "addressId", CustomerAddressCustomFieldRemovedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldRemovedMessage value = CustomerAddressCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldRemovedMessage value = CustomerAddressCustomFieldRemovedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
