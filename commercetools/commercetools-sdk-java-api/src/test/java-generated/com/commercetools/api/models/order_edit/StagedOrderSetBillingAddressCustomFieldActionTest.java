
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetBillingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetBillingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetBillingAddressCustomFieldAction stagedOrderSetBillingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetBillingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetBillingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", StagedOrderSetBillingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetBillingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedOrderSetBillingAddressCustomFieldAction value = StagedOrderSetBillingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetBillingAddressCustomFieldAction value = StagedOrderSetBillingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
