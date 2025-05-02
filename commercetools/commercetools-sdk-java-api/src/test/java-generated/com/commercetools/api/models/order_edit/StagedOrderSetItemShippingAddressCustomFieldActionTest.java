
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetItemShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetItemShippingAddressCustomFieldAction stagedOrderSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetItemShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        StagedOrderSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { "name", StagedOrderSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
