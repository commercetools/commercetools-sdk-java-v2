
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetShippingPolicyUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetShippingPolicyUrlActionBuilder builder) {
        StoreSetShippingPolicyUrlAction storeSetShippingPolicyUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetShippingPolicyUrlAction).isInstanceOf(StoreSetShippingPolicyUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingPolicyUrl",
                StoreSetShippingPolicyUrlAction.builder().shippingPolicyUrl("shippingPolicyUrl") } };
    }

    @Test
    public void shippingPolicyUrl() {
        StoreSetShippingPolicyUrlAction value = StoreSetShippingPolicyUrlAction.of();
        value.setShippingPolicyUrl("shippingPolicyUrl");
        Assertions.assertThat(value.getShippingPolicyUrl()).isEqualTo("shippingPolicyUrl");
    }
}
