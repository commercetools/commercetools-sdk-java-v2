
package com.commercetools.api.models.cart;

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
public class DiscountOnTotalPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountOnTotalPriceBuilder builder) {
        DiscountOnTotalPrice discountOnTotalPrice = builder.buildUnchecked();
        Assertions.assertThat(discountOnTotalPrice).isInstanceOf(DiscountOnTotalPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountOnTotalPrice.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { DiscountOnTotalPrice.builder()
                        .includedDiscounts(Collections.singletonList(
                            new com.commercetools.api.models.cart.DiscountedTotalPricePortionImpl())) },
                new Object[] { DiscountOnTotalPrice.builder()
                        .discountedNetAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { DiscountOnTotalPrice.builder()
                        .discountedGrossAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discountedAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedTotalPricePortionImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.DiscountedTotalPricePortionImpl()));
    }

    @Test
    public void discountedNetAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedNetAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedNetAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void discountedGrossAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedGrossAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedGrossAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
