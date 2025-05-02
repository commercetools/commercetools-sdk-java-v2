
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomTypeRemovedMessagePayloadBuilder builder) {
        CustomerCustomTypeRemovedMessagePayload customerCustomTypeRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomTypeRemovedMessagePayload)
                .isInstanceOf(CustomerCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "previousTypeId",
                CustomerCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerCustomTypeRemovedMessagePayload value = CustomerCustomTypeRemovedMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
