
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreShippingPolicyUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreShippingPolicyUrlSetMessagePayloadBuilder builder) {
        StoreShippingPolicyUrlSetMessagePayload storeShippingPolicyUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeShippingPolicyUrlSetMessagePayload)
                .isInstanceOf(StoreShippingPolicyUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingPolicyUrl",
                StoreShippingPolicyUrlSetMessagePayload.builder().shippingPolicyUrl("shippingPolicyUrl") } };
    }

    @Test
    public void shippingPolicyUrl() {
        StoreShippingPolicyUrlSetMessagePayload value = StoreShippingPolicyUrlSetMessagePayload.of();
        value.setShippingPolicyUrl("shippingPolicyUrl");
        Assertions.assertThat(value.getShippingPolicyUrl()).isEqualTo("shippingPolicyUrl");
    }
}
