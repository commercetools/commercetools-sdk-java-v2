
package com.commercetools.history.models.common;

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
public class DiscountedLineItemPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountedLineItemPriceBuilder builder) {
        DiscountedLineItemPrice discountedLineItemPrice = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPrice).isInstanceOf(DiscountedLineItemPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountedLineItemPrice.builder()
                        .value(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { DiscountedLineItemPrice.builder()
                        .includedDiscounts(Collections.singletonList(
                            new com.commercetools.history.models.common.DiscountedLineItemPortionImpl())) } };
    }

    @Test
    public void value() {
        DiscountedLineItemPrice value = DiscountedLineItemPrice.of();
        value.setValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountedLineItemPrice value = DiscountedLineItemPrice.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.history.models.common.DiscountedLineItemPortionImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.DiscountedLineItemPortionImpl()));
    }
}
