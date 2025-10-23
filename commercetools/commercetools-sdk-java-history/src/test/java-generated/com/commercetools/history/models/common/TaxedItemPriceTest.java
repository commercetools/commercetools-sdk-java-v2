
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxedItemPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxedItemPriceBuilder builder) {
        TaxedItemPrice taxedItemPrice = builder.buildUnchecked();
        Assertions.assertThat(taxedItemPrice).isInstanceOf(TaxedItemPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalNet",
                        TaxedItemPrice.builder()
                                .totalNet(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "totalGross",
                        TaxedItemPrice.builder()
                                .totalGross(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "taxPortions",
                        TaxedItemPrice.builder()
                                .taxPortions(Collections
                                        .singletonList(new com.commercetools.history.models.common.TaxPortionImpl())) },
                new Object[] { "totalTax", TaxedItemPrice.builder()
                        .totalTax(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalNet(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalGross(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxPortions() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTaxPortions(Collections.singletonList(new com.commercetools.history.models.common.TaxPortionImpl()));
        Assertions.assertThat(value.getTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.TaxPortionImpl()));
    }

    @Test
    public void totalTax() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalTax(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalTax())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }
}
