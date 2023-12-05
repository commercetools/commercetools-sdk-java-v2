
package com.commercetools.api.models.shipping_method;

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
public class CartScoreTierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartScoreTierBuilder builder) {
        CartScoreTier cartScoreTier = builder.buildUnchecked();
        Assertions.assertThat(cartScoreTier).isInstanceOf(CartScoreTier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartScoreTier.builder().score(9) },
                new Object[] { CartScoreTier.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CartScoreTier.builder()
                        .priceFunction(new com.commercetools.api.models.shipping_method.PriceFunctionImpl()) },
                new Object[] { CartScoreTier.builder().isMatching(true) } };
    }

    @Test
    public void score() {
        CartScoreTier value = CartScoreTier.of();
        value.setScore(9);
        Assertions.assertThat(value.getScore()).isEqualTo(9);
    }

    @Test
    public void price() {
        CartScoreTier value = CartScoreTier.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void priceFunction() {
        CartScoreTier value = CartScoreTier.of();
        value.setPriceFunction(new com.commercetools.api.models.shipping_method.PriceFunctionImpl());
        Assertions.assertThat(value.getPriceFunction())
                .isEqualTo(new com.commercetools.api.models.shipping_method.PriceFunctionImpl());
    }

    @Test
    public void isMatching() {
        CartScoreTier value = CartScoreTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}
