
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomTypeRemovedMessageBuilder builder) {
        CustomerCustomTypeRemovedMessage customerCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomTypeRemovedMessage).isInstanceOf(CustomerCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "previousTypeId",
                CustomerCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerCustomTypeRemovedMessage value = CustomerCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
