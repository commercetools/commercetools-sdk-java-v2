
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxedPriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxedPriceDraftBuilder builder) {
        TaxedPriceDraft taxedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(taxedPriceDraft).isInstanceOf(TaxedPriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalNet",
                        TaxedPriceDraft.builder().totalNet(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "totalGross",
                        TaxedPriceDraft.builder().totalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "taxPortions",
                        TaxedPriceDraft.builder()
                                .taxPortions(Collections
                                        .singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) },
                new Object[] { "totalTax", TaxedPriceDraft.builder()
                        .totalTax(new com.commercetools.api.models.common.TypedMoneyDraftImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedPriceDraft value = TaxedPriceDraft.of();
        value.setTotalNet(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalNet()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedPriceDraft value = TaxedPriceDraft.of();
        value.setTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxPortions() {
        TaxedPriceDraft value = TaxedPriceDraft.of();
        value.setTaxPortions(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
        Assertions.assertThat(value.getTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
    }

    @Test
    public void totalTax() {
        TaxedPriceDraft value = TaxedPriceDraft.of();
        value.setTotalTax(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
        Assertions.assertThat(value.getTotalTax())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
    }
}
