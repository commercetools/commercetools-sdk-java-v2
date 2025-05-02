
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SyncInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SyncInfoBuilder builder) {
        SyncInfo syncInfo = builder.buildUnchecked();
        Assertions.assertThat(syncInfo).isInstanceOf(SyncInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "channel",
                        SyncInfo.builder().channel(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "externalId", SyncInfo.builder().externalId("externalId") },
                new Object[] { "syncedAt", SyncInfo.builder().syncedAt("syncedAt") } };
    }

    @Test
    public void channel() {
        SyncInfo value = SyncInfo.of();
        value.setChannel(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void externalId() {
        SyncInfo value = SyncInfo.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void syncedAt() {
        SyncInfo value = SyncInfo.of();
        value.setSyncedAt("syncedAt");
        Assertions.assertThat(value.getSyncedAt()).isEqualTo("syncedAt");
    }
}
