
package com.commercetools.api.models.order;

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
public class DiscountedLineItemPriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPriceDraftBuilder builder) {
        DiscountedLineItemPriceDraft discountedLineItemPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPriceDraft).isInstanceOf(DiscountedLineItemPriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedLineItemPriceDraft.builder()
                        .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { DiscountedLineItemPriceDraft.builder()
                        .includedDiscounts(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl())) } };
    }

    @Test
    public void value() {
        DiscountedLineItemPriceDraft value = DiscountedLineItemPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountedLineItemPriceDraft value = DiscountedLineItemPriceDraft.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl()));
    }
}
