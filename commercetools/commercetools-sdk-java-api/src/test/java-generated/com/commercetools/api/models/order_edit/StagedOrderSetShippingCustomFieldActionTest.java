
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingCustomFieldActionBuilder builder) {
        StagedOrderSetShippingCustomFieldAction stagedOrderSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingCustomFieldAction)
                .isInstanceOf(StagedOrderSetShippingCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey",
                        StagedOrderSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { "name", StagedOrderSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
