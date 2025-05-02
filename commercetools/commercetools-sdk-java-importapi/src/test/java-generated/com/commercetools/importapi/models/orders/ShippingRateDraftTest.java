
package com.commercetools.importapi.models.orders;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingRateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingRateDraftBuilder builder) {
        ShippingRateDraft shippingRateDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingRateDraft).isInstanceOf(ShippingRateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "price",
                        ShippingRateDraft.builder().price(new com.commercetools.importapi.models.common.MoneyImpl()) },
                new Object[] { "freeAbove",
                        ShippingRateDraft.builder()
                                .freeAbove(new com.commercetools.importapi.models.common.MoneyImpl()) },
                new Object[] { "tiers",
                        ShippingRateDraft.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl())) } };
    }

    @Test
    public void price() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setPrice(new com.commercetools.importapi.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.importapi.models.common.MoneyImpl());
    }

    @Test
    public void freeAbove() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setFreeAbove(new com.commercetools.importapi.models.common.MoneyImpl());
        Assertions.assertThat(value.getFreeAbove())
                .isEqualTo(new com.commercetools.importapi.models.common.MoneyImpl());
    }

    @Test
    public void tiers() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl()));
    }
}
