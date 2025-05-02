
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetBillingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetBillingAddressActionBuilder builder) {
        StagedOrderSetBillingAddressAction stagedOrderSetBillingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetBillingAddressAction)
                .isInstanceOf(StagedOrderSetBillingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", StagedOrderSetBillingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        StagedOrderSetBillingAddressAction value = StagedOrderSetBillingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
