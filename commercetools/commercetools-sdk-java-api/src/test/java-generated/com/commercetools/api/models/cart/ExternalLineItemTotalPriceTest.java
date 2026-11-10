
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalLineItemTotalPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalLineItemTotalPriceBuilder builder) {
        ExternalLineItemTotalPrice externalLineItemTotalPrice = builder.buildUnchecked();
        Assertions.assertThat(externalLineItemTotalPrice).isInstanceOf(ExternalLineItemTotalPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "price",
                        ExternalLineItemTotalPrice.builder()
                                .price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "totalPrice", ExternalLineItemTotalPrice.builder()
                        .totalPrice(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void price() {
        ExternalLineItemTotalPrice value = ExternalLineItemTotalPrice.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void totalPrice() {
        ExternalLineItemTotalPrice value = ExternalLineItemTotalPrice.of();
        value.setTotalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
