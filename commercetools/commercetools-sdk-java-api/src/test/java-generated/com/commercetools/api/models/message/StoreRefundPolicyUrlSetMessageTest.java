
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRefundPolicyUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRefundPolicyUrlSetMessageBuilder builder) {
        StoreRefundPolicyUrlSetMessage storeRefundPolicyUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeRefundPolicyUrlSetMessage).isInstanceOf(StoreRefundPolicyUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "refundPolicyUrl",
                StoreRefundPolicyUrlSetMessage.builder().refundPolicyUrl("refundPolicyUrl") } };
    }

    @Test
    public void refundPolicyUrl() {
        StoreRefundPolicyUrlSetMessage value = StoreRefundPolicyUrlSetMessage.of();
        value.setRefundPolicyUrl("refundPolicyUrl");
        Assertions.assertThat(value.getRefundPolicyUrl()).isEqualTo("refundPolicyUrl");
    }
}
