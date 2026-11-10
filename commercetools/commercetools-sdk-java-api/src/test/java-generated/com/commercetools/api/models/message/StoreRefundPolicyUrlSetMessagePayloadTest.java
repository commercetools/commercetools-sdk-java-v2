
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRefundPolicyUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRefundPolicyUrlSetMessagePayloadBuilder builder) {
        StoreRefundPolicyUrlSetMessagePayload storeRefundPolicyUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeRefundPolicyUrlSetMessagePayload)
                .isInstanceOf(StoreRefundPolicyUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "refundPolicyUrl",
                StoreRefundPolicyUrlSetMessagePayload.builder().refundPolicyUrl("refundPolicyUrl") } };
    }

    @Test
    public void refundPolicyUrl() {
        StoreRefundPolicyUrlSetMessagePayload value = StoreRefundPolicyUrlSetMessagePayload.of();
        value.setRefundPolicyUrl("refundPolicyUrl");
        Assertions.assertThat(value.getRefundPolicyUrl()).isEqualTo("refundPolicyUrl");
    }
}
