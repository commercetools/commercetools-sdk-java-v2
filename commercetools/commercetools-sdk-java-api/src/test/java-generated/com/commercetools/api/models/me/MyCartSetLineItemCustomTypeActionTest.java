
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemCustomTypeActionBuilder builder) {
        MyCartSetLineItemCustomTypeAction myCartSetLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemCustomTypeAction).isInstanceOf(MyCartSetLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartSetLineItemCustomTypeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", MyCartSetLineItemCustomTypeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "type",
                        MyCartSetLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", MyCartSetLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemCustomTypeAction value = MyCartSetLineItemCustomTypeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemCustomTypeAction value = MyCartSetLineItemCustomTypeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void type() {
        MyCartSetLineItemCustomTypeAction value = MyCartSetLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        MyCartSetLineItemCustomTypeAction value = MyCartSetLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
