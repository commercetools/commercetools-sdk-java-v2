
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchSortingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchSortingBuilder builder) {
        OrderSearchSorting orderSearchSorting = builder.buildUnchecked();
        Assertions.assertThat(orderSearchSorting).isInstanceOf(OrderSearchSorting.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", OrderSearchSorting.builder().field("field") },
                new Object[] { "language", OrderSearchSorting.builder().language("language") },
                new Object[] { "order",
                        OrderSearchSorting.builder()
                                .order(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc")) },
                new Object[] { "mode",
                        OrderSearchSorting.builder()
                                .mode(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min")) },
                new Object[] { "filter", OrderSearchSorting.builder()
                        .filter(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()) } };
    }

    @Test
    public void field() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void language() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void order() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setOrder(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc"));
    }

    @Test
    public void mode() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setMode(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min"));
    }

    @Test
    public void filter() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setFilter(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl());
    }
}
