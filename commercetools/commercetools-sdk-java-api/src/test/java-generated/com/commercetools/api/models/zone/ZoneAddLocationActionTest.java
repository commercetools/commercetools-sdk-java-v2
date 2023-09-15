
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
public class ZoneAddLocationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneAddLocationActionBuilder builder) {
        ZoneAddLocationAction zoneAddLocationAction = builder.buildUnchecked();
        Assertions.assertThat(zoneAddLocationAction).isInstanceOf(ZoneAddLocationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ZoneAddLocationAction.builder().location(new com.commercetools.api.models.zone.LocationImpl()) } };
    }

    @Test
    public void location() {
        ZoneAddLocationAction value = ZoneAddLocationAction.of();
        value.setLocation(new com.commercetools.api.models.zone.LocationImpl());
        Assertions.assertThat(value.getLocation()).isEqualTo(new com.commercetools.api.models.zone.LocationImpl());
    }
}
