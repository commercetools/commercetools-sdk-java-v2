
package com.commercetools.api.models.common;

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
public class DiscountedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedPriceBuilder builder) {
        DiscountedPrice discountedPrice = builder.buildUnchecked();
        Assertions.assertThat(discountedPrice).isInstanceOf(DiscountedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        DiscountedPrice.builder().value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { DiscountedPrice.builder()
                        .discount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl()) } };
    }

    @Test
    public void value() {
        DiscountedPrice value = DiscountedPrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void discount() {
        DiscountedPrice value = DiscountedPrice.of();
        value.setDiscount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
    }
}
