
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetRefundPolicyUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetRefundPolicyUrlActionBuilder builder) {
        StoreSetRefundPolicyUrlAction storeSetRefundPolicyUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetRefundPolicyUrlAction).isInstanceOf(StoreSetRefundPolicyUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "refundPolicyUrl",
                StoreSetRefundPolicyUrlAction.builder().refundPolicyUrl("refundPolicyUrl") } };
    }

    @Test
    public void refundPolicyUrl() {
        StoreSetRefundPolicyUrlAction value = StoreSetRefundPolicyUrlAction.of();
        value.setRefundPolicyUrl("refundPolicyUrl");
        Assertions.assertThat(value.getRefundPolicyUrl()).isEqualTo("refundPolicyUrl");
    }
}
