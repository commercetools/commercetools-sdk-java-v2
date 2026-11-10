
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveItemShippingAddressActionBuilder builder) {
        StagedOrderRemoveItemShippingAddressAction stagedOrderRemoveItemShippingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveItemShippingAddressAction)
                .isInstanceOf(StagedOrderRemoveItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "addressKey",
                StagedOrderRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        StagedOrderRemoveItemShippingAddressAction value = StagedOrderRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
