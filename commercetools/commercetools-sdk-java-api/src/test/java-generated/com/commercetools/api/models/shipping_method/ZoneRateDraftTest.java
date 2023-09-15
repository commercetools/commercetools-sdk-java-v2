
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
public class ZoneRateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneRateDraftBuilder builder) {
        ZoneRateDraft zoneRateDraft = builder.buildUnchecked();
        Assertions.assertThat(zoneRateDraft).isInstanceOf(ZoneRateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ZoneRateDraft.builder()
                        .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { ZoneRateDraft.builder()
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
