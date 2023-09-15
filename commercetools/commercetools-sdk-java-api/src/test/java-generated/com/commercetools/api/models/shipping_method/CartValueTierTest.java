
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
public class CartValueTierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartValueTierBuilder builder) {
        CartValueTier cartValueTier = builder.buildUnchecked();
        Assertions.assertThat(cartValueTier).isInstanceOf(CartValueTier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartValueTier.builder().minimumCentAmount(3L) },
                new Object[] { CartValueTier.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CartValueTier.builder().isMatching(true) } };
    }

    @Test
    public void minimumCentAmount() {
        CartValueTier value = CartValueTier.of();
        value.setMinimumCentAmount(3L);
        Assertions.assertThat(value.getMinimumCentAmount()).isEqualTo(3L);
    }

    @Test
    public void price() {
        CartValueTier value = CartValueTier.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void isMatching() {
        CartValueTier value = CartValueTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}
