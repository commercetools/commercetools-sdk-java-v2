
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneRateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneRateBuilder builder) {
        ZoneRate zoneRate = builder.buildUnchecked();
        Assertions.assertThat(zoneRate).isInstanceOf(ZoneRate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "zone",
                        ZoneRate.builder().zone(new com.commercetools.api.models.zone.ZoneReferenceImpl()) },
                new Object[] { "shippingRates",
                        ZoneRate.builder()
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
