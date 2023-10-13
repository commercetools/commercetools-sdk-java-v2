
package com.commercetools.importapi.models.orders;

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
public class CartClassificationTierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartClassificationTierBuilder builder) {
        CartClassificationTier cartClassificationTier = builder.buildUnchecked();
        Assertions.assertThat(cartClassificationTier).isInstanceOf(CartClassificationTier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartClassificationTier.builder().value("value") },
                new Object[] { CartClassificationTier.builder()
                        .price(new com.commercetools.importapi.models.common.MoneyImpl()) },
                new Object[] { CartClassificationTier.builder()
                        .tiers(Collections.singletonList(
                            new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl())) },
                new Object[] { CartClassificationTier.builder().isMatching(true) } };
    }

    @Test
    public void value() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void price() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setPrice(new com.commercetools.importapi.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.importapi.models.common.MoneyImpl());
    }

    @Test
    public void tiers() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.orders.ShippingRatePriceTierImpl()));
    }

    @Test
    public void isMatching() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}
