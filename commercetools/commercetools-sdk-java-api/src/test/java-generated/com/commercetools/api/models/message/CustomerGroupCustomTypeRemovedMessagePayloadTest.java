
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomTypeRemovedMessagePayloadBuilder builder) {
        CustomerGroupCustomTypeRemovedMessagePayload customerGroupCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomTypeRemovedMessagePayload)
                .isInstanceOf(CustomerGroupCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldTypeId",
                CustomerGroupCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        CustomerGroupCustomTypeRemovedMessagePayload value = CustomerGroupCustomTypeRemovedMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
