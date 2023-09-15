
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
public class DiscountedLineItemPortionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPortionBuilder builder) {
        DiscountedLineItemPortion discountedLineItemPortion = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPortion).isInstanceOf(DiscountedLineItemPortion.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedLineItemPortion.builder()
                        .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { DiscountedLineItemPortion.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
