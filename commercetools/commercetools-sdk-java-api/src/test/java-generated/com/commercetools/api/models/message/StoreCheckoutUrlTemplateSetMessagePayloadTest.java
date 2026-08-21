
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCheckoutUrlTemplateSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCheckoutUrlTemplateSetMessagePayloadBuilder builder) {
        StoreCheckoutUrlTemplateSetMessagePayload storeCheckoutUrlTemplateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCheckoutUrlTemplateSetMessagePayload)
                .isInstanceOf(StoreCheckoutUrlTemplateSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "checkoutUrlTemplate",
                StoreCheckoutUrlTemplateSetMessagePayload.builder().checkoutUrlTemplate("checkoutUrlTemplate") } };
    }

    @Test
    public void checkoutUrlTemplate() {
        StoreCheckoutUrlTemplateSetMessagePayload value = StoreCheckoutUrlTemplateSetMessagePayload.of();
        value.setCheckoutUrlTemplate("checkoutUrlTemplate");
        Assertions.assertThat(value.getCheckoutUrlTemplate()).isEqualTo("checkoutUrlTemplate");
    }
}
