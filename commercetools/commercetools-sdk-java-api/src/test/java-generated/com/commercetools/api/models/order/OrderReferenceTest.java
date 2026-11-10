
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderReferenceBuilder builder) {
        OrderReference orderReference = builder.buildUnchecked();
        Assertions.assertThat(orderReference).isInstanceOf(OrderReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        OrderReference.builder().obj(new com.commercetools.api.models.order.OrderImpl()) },
                new Object[] { "id", OrderReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        OrderReference value = OrderReference.of();
        value.setObj(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }

    @Test
    public void id() {
        OrderReference value = OrderReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
