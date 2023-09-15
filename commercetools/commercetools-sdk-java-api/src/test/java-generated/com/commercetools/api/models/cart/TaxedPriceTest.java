
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
public class TaxedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxedPriceBuilder builder) {
        TaxedPrice taxedPrice = builder.buildUnchecked();
        Assertions.assertThat(taxedPrice).isInstanceOf(TaxedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TaxedPrice.builder()
                        .totalNet(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { TaxedPrice.builder()
                        .totalGross(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] {
                        TaxedPrice.builder()
                                .taxPortions(Collections
                                        .singletonList(new com.commercetools.api.models.cart.TaxPortionImpl())) },
                new Object[] { TaxedPrice.builder()
                        .totalTax(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalNet(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalGross(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxPortions() {
        TaxedPrice value = TaxedPrice.of();
        value.setTaxPortions(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionImpl()));
        Assertions.assertThat(value.getTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionImpl()));
    }

    @Test
    public void totalTax() {
        TaxedPrice value = TaxedPrice.of();
        value.setTotalTax(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalTax())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }
}
