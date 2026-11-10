
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomTypeRemovedMessageBuilder builder) {
        CustomerGroupCustomTypeRemovedMessage customerGroupCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomTypeRemovedMessage)
                .isInstanceOf(CustomerGroupCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldTypeId", CustomerGroupCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        CustomerGroupCustomTypeRemovedMessage value = CustomerGroupCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
