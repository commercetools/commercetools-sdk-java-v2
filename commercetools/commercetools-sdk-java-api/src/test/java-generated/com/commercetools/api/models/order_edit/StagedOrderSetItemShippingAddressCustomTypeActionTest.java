
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetItemShippingAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder) {
        StagedOrderSetItemShippingAddressCustomTypeAction stagedOrderSetItemShippingAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetItemShippingAddressCustomTypeAction)
                .isInstanceOf(StagedOrderSetItemShippingAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        StagedOrderSetItemShippingAddressCustomTypeAction.builder().addressKey("addressKey") },
                new Object[] { "type",
                        StagedOrderSetItemShippingAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetItemShippingAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void addressKey() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void type() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
