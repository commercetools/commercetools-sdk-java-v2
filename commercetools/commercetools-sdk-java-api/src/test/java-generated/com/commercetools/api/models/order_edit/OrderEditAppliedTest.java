
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditAppliedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditAppliedBuilder builder) {
        OrderEditApplied orderEditApplied = builder.buildUnchecked();
        Assertions.assertThat(orderEditApplied).isInstanceOf(OrderEditApplied.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "appliedAt",
                        OrderEditApplied.builder().appliedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "excerptBeforeEdit",
                        OrderEditApplied.builder()
                                .excerptBeforeEdit(new com.commercetools.api.models.order_edit.OrderExcerptImpl()) },
                new Object[] { "excerptAfterEdit", OrderEditApplied.builder()
                        .excerptAfterEdit(new com.commercetools.api.models.order_edit.OrderExcerptImpl()) } };
    }

    @Test
    public void appliedAt() {
        OrderEditApplied value = OrderEditApplied.of();
        value.setAppliedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAppliedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void excerptBeforeEdit() {
        OrderEditApplied value = OrderEditApplied.of();
        value.setExcerptBeforeEdit(new com.commercetools.api.models.order_edit.OrderExcerptImpl());
        Assertions.assertThat(value.getExcerptBeforeEdit())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderExcerptImpl());
    }

    @Test
    public void excerptAfterEdit() {
        OrderEditApplied value = OrderEditApplied.of();
        value.setExcerptAfterEdit(new com.commercetools.api.models.order_edit.OrderExcerptImpl());
        Assertions.assertThat(value.getExcerptAfterEdit())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderExcerptImpl());
    }
}
