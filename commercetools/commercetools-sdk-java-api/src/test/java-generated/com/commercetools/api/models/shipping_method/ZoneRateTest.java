
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
public class ZoneRateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneRateBuilder builder) {
        ZoneRate zoneRate = builder.buildUnchecked();
        Assertions.assertThat(zoneRate).isInstanceOf(ZoneRate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ZoneRate.builder().zone(new com.commercetools.api.models.zone.ZoneReferenceImpl()) },
                new Object[] { ZoneRate.builder()
                        .shippingRates(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingRateImpl())) } };
    }

    @Test
    public void zone() {
        ZoneRate value = ZoneRate.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneReferenceImpl());
        Assertions.assertThat(value.getZone()).isEqualTo(new com.commercetools.api.models.zone.ZoneReferenceImpl());
    }

    @Test
    public void shippingRates() {
        ZoneRate value = ZoneRate.of();
        value.setShippingRates(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingRateImpl()));
        Assertions.assertThat(value.getShippingRates())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingRateImpl()));
    }
}
