
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetShippingAddressCustomFieldAction stagedOrderSetShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", StagedOrderSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedOrderSetShippingAddressCustomFieldAction value = StagedOrderSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetShippingAddressCustomFieldAction value = StagedOrderSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
