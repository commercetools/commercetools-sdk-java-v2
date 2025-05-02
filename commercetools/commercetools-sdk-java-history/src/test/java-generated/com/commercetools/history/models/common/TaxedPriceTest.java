
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxedPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxedPriceBuilder builder) {
        TaxedPrice taxedPrice = builder.buildUnchecked();
        Assertions.assertThat(taxedPrice).isInstanceOf(TaxedPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalNet",
                        TaxedPrice.builder().totalNet(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "totalGross",
                        TaxedPrice.builder().totalGross(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalNet(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalNet()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalGross(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
