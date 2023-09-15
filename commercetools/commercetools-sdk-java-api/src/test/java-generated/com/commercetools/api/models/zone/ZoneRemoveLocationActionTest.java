
package com.commercetools.api.models.zone;

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
public class ZoneRemoveLocationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneRemoveLocationActionBuilder builder) {
        ZoneRemoveLocationAction zoneRemoveLocationAction = builder.buildUnchecked();
        Assertions.assertThat(zoneRemoveLocationAction).isInstanceOf(ZoneRemoveLocationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ZoneRemoveLocationAction.builder().location(new com.commercetools.api.models.zone.LocationImpl()) } };
    }

    @Test
    public void location() {
        ZoneRemoveLocationAction value = ZoneRemoveLocationAction.of();
        value.setLocation(new com.commercetools.api.models.zone.LocationImpl());
        Assertions.assertThat(value.getLocation()).isEqualTo(new com.commercetools.api.models.zone.LocationImpl());
    }
}
