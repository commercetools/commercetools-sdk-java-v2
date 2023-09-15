
package com.commercetools.history.models.common;

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
                new Object[] { TaxedPrice.builder().totalNet(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] {
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
