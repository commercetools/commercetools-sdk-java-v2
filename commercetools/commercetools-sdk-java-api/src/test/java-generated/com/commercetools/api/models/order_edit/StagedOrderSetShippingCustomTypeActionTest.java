
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingCustomTypeActionBuilder builder) {
        StagedOrderSetShippingCustomTypeAction stagedOrderSetShippingCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingCustomTypeAction)
                .isInstanceOf(StagedOrderSetShippingCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey",
                        StagedOrderSetShippingCustomTypeAction.builder().shippingKey("shippingKey") },
                new Object[] { "type",
                        StagedOrderSetShippingCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetShippingCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingCustomTypeAction value = StagedOrderSetShippingCustomTypeAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void type() {
        StagedOrderSetShippingCustomTypeAction value = StagedOrderSetShippingCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetShippingCustomTypeAction value = StagedOrderSetShippingCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
