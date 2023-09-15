
package com.commercetools.importapi.models.orders;

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
public class CustomLineItemTaxedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomLineItemTaxedPriceBuilder builder) {
        CustomLineItemTaxedPrice customLineItemTaxedPrice = builder.buildUnchecked();
        Assertions.assertThat(customLineItemTaxedPrice).isInstanceOf(CustomLineItemTaxedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomLineItemTaxedPrice.builder()
                        .totalNet(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { CustomLineItemTaxedPrice.builder()
                        .totalGross(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        CustomLineItemTaxedPrice value = CustomLineItemTaxedPrice.of();
        value.setTotalNet(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void totalGross() {
        CustomLineItemTaxedPrice value = CustomLineItemTaxedPrice.of();
        value.setTotalGross(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
