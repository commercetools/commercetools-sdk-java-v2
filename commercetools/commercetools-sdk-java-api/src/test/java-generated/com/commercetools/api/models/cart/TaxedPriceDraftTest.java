
package com.commercetools.api.models.cart;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class TaxedPriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxedPriceDraftBuilder builder) {
        TaxedPriceDraft taxedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(taxedPriceDraft).isInstanceOf(TaxedPriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        TaxedPriceDraft.builder().totalNet(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] {
                        TaxedPriceDraft.builder().totalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] {
                        TaxedPriceDraft.builder()
                                .taxPortions(Collections
                                        .singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) },
                new Object[] { TaxedPriceDraft.builder()
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
