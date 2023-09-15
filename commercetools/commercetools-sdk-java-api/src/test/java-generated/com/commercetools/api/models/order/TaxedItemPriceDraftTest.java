
package com.commercetools.api.models.order;

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
public class TaxedItemPriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxedItemPriceDraftBuilder builder) {
        TaxedItemPriceDraft taxedItemPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(taxedItemPriceDraft).isInstanceOf(TaxedItemPriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        TaxedItemPriceDraft.builder().totalNet(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { TaxedItemPriceDraft.builder()
                        .totalGross(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedItemPriceDraft value = TaxedItemPriceDraft.of();
        value.setTotalNet(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalNet()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedItemPriceDraft value = TaxedItemPriceDraft.of();
        value.setTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalGross()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
