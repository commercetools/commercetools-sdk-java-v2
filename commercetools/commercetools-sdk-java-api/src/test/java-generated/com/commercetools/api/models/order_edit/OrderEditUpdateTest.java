
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditUpdateBuilder builder) {
        OrderEditUpdate orderEditUpdate = builder.buildUnchecked();
        Assertions.assertThat(orderEditUpdate).isInstanceOf(OrderEditUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", OrderEditUpdate.builder().version(2L) },
                new Object[] { "actions",
                        OrderEditUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl())) },
                new Object[] { "dryRun", OrderEditUpdate.builder().dryRun(true) } };
    }

    @Test
    public void version() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl()));
    }

    @Test
    public void dryRun() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setDryRun(true);
        Assertions.assertThat(value.getDryRun()).isEqualTo(true);
    }
}
