
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
public class ShippingRateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingRateDraftBuilder builder) {
        ShippingRateDraft shippingRateDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingRateDraft).isInstanceOf(ShippingRateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingRateDraft.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] {
                        ShippingRateDraft.builder().freeAbove(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { ShippingRateDraft.builder()
                        .tiers(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl())) } };
    }

    @Test
    public void price() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void freeAbove() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setFreeAbove(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getFreeAbove()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void tiers() {
        ShippingRateDraft value = ShippingRateDraft.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shipping_method.ShippingRatePriceTierImpl()));
    }
}
