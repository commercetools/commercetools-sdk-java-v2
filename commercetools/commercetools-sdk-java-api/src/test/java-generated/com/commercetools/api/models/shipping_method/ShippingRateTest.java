
package com.commercetools.api.models.shipping_method;

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
public class ShippingRateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingRateBuilder builder) {
        ShippingRate shippingRate = builder.buildUnchecked();
        Assertions.assertThat(shippingRate).isInstanceOf(ShippingRate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingRate.builder().price(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] {
                        ShippingRate.builder().freeAbove(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { ShippingRate.builder().isMatching(true) },
                new Object[] { ShippingRate.builder()
                        .tiers(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl())) } };
    }

    @Test
    public void price() {
        ShippingRate value = ShippingRate.of();
        value.setPrice(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void freeAbove() {
        ShippingRate value = ShippingRate.of();
        value.setFreeAbove(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getFreeAbove()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void isMatching() {
        ShippingRate value = ShippingRate.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }

    @Test
    public void tiers() {
        ShippingRate value = ShippingRate.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl()));
    }
}
