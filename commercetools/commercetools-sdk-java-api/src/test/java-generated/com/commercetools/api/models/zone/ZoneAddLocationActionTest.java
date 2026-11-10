
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneAddLocationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneAddLocationActionBuilder builder) {
        ZoneAddLocationAction zoneAddLocationAction = builder.buildUnchecked();
        Assertions.assertThat(zoneAddLocationAction).isInstanceOf(ZoneAddLocationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "location",
                ZoneAddLocationAction.builder().location(new com.commercetools.api.models.zone.LocationImpl()) } };
    }

    @Test
    public void location() {
        ZoneAddLocationAction value = ZoneAddLocationAction.of();
        value.setLocation(new com.commercetools.api.models.zone.LocationImpl());
        Assertions.assertThat(value.getLocation()).isEqualTo(new com.commercetools.api.models.zone.LocationImpl());
    }
}
