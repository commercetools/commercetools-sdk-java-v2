
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemCustomFieldActionBuilder builder) {
        MyCartSetLineItemCustomFieldAction myCartSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemCustomFieldAction)
                .isInstanceOf(MyCartSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", MyCartSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", MyCartSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyCartSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
