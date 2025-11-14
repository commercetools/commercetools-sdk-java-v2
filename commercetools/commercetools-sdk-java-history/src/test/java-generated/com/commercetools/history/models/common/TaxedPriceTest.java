
package com.commercetools.history.models.common;

import java.util.Collections;

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
                        TaxedPrice.builder()
                                .totalNet(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "totalGross",
                        TaxedPrice.builder()
                                .totalGross(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "taxPortions",
                        TaxedPrice.builder()
                                .taxPortions(Collections
                                        .singletonList(new com.commercetools.history.models.common.TaxPortionImpl())) },
                new Object[] { "totalTax", TaxedPrice.builder()
                        .totalTax(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalNet(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalGross(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxPortions() {
        TaxedPrice value = TaxedPrice.of();
        value.setTaxPortions(Collections.singletonList(new com.commercetools.history.models.common.TaxPortionImpl()));
        Assertions.assertThat(value.getTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.TaxPortionImpl()));
    }

    @Test
    public void totalTax() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalTax(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalTax())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }
}
