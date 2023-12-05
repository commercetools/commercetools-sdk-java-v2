
package com.commercetools.api.models.cart;

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
public class TaxedItemPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxedItemPriceBuilder builder) {
        TaxedItemPrice taxedItemPrice = builder.buildUnchecked();
        Assertions.assertThat(taxedItemPrice).isInstanceOf(TaxedItemPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TaxedItemPrice.builder()
                        .totalNet(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { TaxedItemPrice.builder()
                        .totalGross(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { TaxedItemPrice.builder()
                        .totalTax(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalNet(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void totalGross() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalGross(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void totalTax() {
        TaxedItemPrice value = TaxedItemPrice.of();
        value.setTotalTax(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalTax())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }
}
