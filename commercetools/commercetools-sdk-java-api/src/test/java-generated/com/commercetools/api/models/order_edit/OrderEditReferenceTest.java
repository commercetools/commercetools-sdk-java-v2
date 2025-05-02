
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditReferenceBuilder builder) {
        OrderEditReference orderEditReference = builder.buildUnchecked();
        Assertions.assertThat(orderEditReference).isInstanceOf(OrderEditReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        OrderEditReference.builder().obj(new com.commercetools.api.models.order_edit.OrderEditImpl()) },
                new Object[] { "id", OrderEditReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        OrderEditReference value = OrderEditReference.of();
        value.setObj(new com.commercetools.api.models.order_edit.OrderEditImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.order_edit.OrderEditImpl());
    }

    @Test
    public void id() {
        OrderEditReference value = OrderEditReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
