
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneRateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneRateDraftBuilder builder) {
        ZoneRateDraft zoneRateDraft = builder.buildUnchecked();
        Assertions.assertThat(zoneRateDraft).isInstanceOf(ZoneRateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "zone",
                        ZoneRateDraft.builder()
                                .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { "shippingRates",
                        ZoneRateDraft.builder()
                                .shippingRates(Collections.singletonList(
                                    new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl())) } };
    }

    @Test
    public void zone() {
        ZoneRateDraft value = ZoneRateDraft.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
    }

    @Test
    public void shippingRates() {
        ZoneRateDraft value = ZoneRateDraft.of();
        value.setShippingRates(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()));
        Assertions.assertThat(value.getShippingRates())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()));
    }
}
