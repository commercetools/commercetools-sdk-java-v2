
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneRemoveLocationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneRemoveLocationActionBuilder builder) {
        ZoneRemoveLocationAction zoneRemoveLocationAction = builder.buildUnchecked();
        Assertions.assertThat(zoneRemoveLocationAction).isInstanceOf(ZoneRemoveLocationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "location",
                ZoneRemoveLocationAction.builder().location(new com.commercetools.api.models.zone.LocationImpl()) } };
    }

    @Test
    public void location() {
        ZoneRemoveLocationAction value = ZoneRemoveLocationAction.of();
        value.setLocation(new com.commercetools.api.models.zone.LocationImpl());
        Assertions.assertThat(value.getLocation()).isEqualTo(new com.commercetools.api.models.zone.LocationImpl());
    }
}
