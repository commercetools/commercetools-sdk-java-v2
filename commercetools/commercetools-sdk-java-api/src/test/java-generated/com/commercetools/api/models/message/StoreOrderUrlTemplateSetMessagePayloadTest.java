
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreOrderUrlTemplateSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreOrderUrlTemplateSetMessagePayloadBuilder builder) {
        StoreOrderUrlTemplateSetMessagePayload storeOrderUrlTemplateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeOrderUrlTemplateSetMessagePayload)
                .isInstanceOf(StoreOrderUrlTemplateSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderUrlTemplate",
                StoreOrderUrlTemplateSetMessagePayload.builder().orderUrlTemplate("orderUrlTemplate") } };
    }

    @Test
    public void orderUrlTemplate() {
        StoreOrderUrlTemplateSetMessagePayload value = StoreOrderUrlTemplateSetMessagePayload.of();
        value.setOrderUrlTemplate("orderUrlTemplate");
        Assertions.assertThat(value.getOrderUrlTemplate()).isEqualTo("orderUrlTemplate");
    }
}
