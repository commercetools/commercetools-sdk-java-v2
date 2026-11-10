
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderExcerptTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderExcerptBuilder builder) {
        OrderExcerpt orderExcerpt = builder.buildUnchecked();
        Assertions.assertThat(orderExcerpt).isInstanceOf(OrderExcerpt.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalPrice",
                        OrderExcerpt.builder().totalPrice(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "taxedPrice",
                        OrderExcerpt.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { "version", OrderExcerpt.builder().version(2L) } };
    }

    @Test
    public void totalPrice() {
        OrderExcerpt value = OrderExcerpt.of();
        value.setTotalPrice(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderExcerpt value = OrderExcerpt.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice()).isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void version() {
        OrderExcerpt value = OrderExcerpt.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
