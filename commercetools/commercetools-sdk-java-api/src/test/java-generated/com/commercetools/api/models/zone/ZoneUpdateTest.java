
package com.commercetools.api.models.zone;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneUpdateBuilder builder) {
        ZoneUpdate zoneUpdate = builder.buildUnchecked();
        Assertions.assertThat(zoneUpdate).isInstanceOf(ZoneUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ZoneUpdate.builder().version(2L) }, new Object[] { "actions",
                ZoneUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ZoneUpdate value = ZoneUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ZoneUpdate value = ZoneUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl()));
    }
}
