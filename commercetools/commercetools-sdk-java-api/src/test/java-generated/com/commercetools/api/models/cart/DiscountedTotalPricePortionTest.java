
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
public class DiscountedTotalPricePortionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedTotalPricePortionBuilder builder) {
        DiscountedTotalPricePortion discountedTotalPricePortion = builder.buildUnchecked();
        Assertions.assertThat(discountedTotalPricePortion).isInstanceOf(DiscountedTotalPricePortion.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedTotalPricePortion.builder()
                        .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { DiscountedTotalPricePortion.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedTotalPricePortion value = DiscountedTotalPricePortion.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedTotalPricePortion value = DiscountedTotalPricePortion.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
