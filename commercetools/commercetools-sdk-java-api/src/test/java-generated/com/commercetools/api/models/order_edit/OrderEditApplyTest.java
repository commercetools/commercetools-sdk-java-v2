
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditApplyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditApplyBuilder builder) {
        OrderEditApply orderEditApply = builder.buildUnchecked();
        Assertions.assertThat(orderEditApply).isInstanceOf(OrderEditApply.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "editVersion", OrderEditApply.builder().editVersion(7L) },
                new Object[] { "resourceVersion", OrderEditApply.builder().resourceVersion(9L) } };
    }

    @Test
    public void editVersion() {
        OrderEditApply value = OrderEditApply.of();
        value.setEditVersion(7L);
        Assertions.assertThat(value.getEditVersion()).isEqualTo(7L);
    }

    @Test
    public void resourceVersion() {
        OrderEditApply value = OrderEditApply.of();
        value.setResourceVersion(9L);
        Assertions.assertThat(value.getResourceVersion()).isEqualTo(9L);
    }
}
