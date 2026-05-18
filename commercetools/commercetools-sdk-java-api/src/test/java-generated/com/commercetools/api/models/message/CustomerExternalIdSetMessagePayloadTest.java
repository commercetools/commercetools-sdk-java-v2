
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerExternalIdSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerExternalIdSetMessagePayloadBuilder builder) {
        CustomerExternalIdSetMessagePayload customerExternalIdSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerExternalIdSetMessagePayload)
                .isInstanceOf(CustomerExternalIdSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", CustomerExternalIdSetMessagePayload.builder().externalId("externalId") } };
    }

    @Test
    public void externalId() {
        CustomerExternalIdSetMessagePayload value = CustomerExternalIdSetMessagePayload.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
