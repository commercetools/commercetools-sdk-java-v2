
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
public class DiscountedPriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedPriceDraftBuilder builder) {
        DiscountedPriceDraft discountedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedPriceDraft).isInstanceOf(DiscountedPriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        DiscountedPriceDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { DiscountedPriceDraft.builder()
                        .discount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl()) } };
    }

    @Test
    public void value() {
        DiscountedPriceDraft value = DiscountedPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void discount() {
        DiscountedPriceDraft value = DiscountedPriceDraft.of();
        value.setDiscount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
    }
}
