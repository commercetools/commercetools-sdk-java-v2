
package com.commercetools.history.models.common;

import java.time.ZonedDateTime;

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
                        SyncInfo.builder()
                                .channel(new com.commercetools.history.models.common.ChannelReferenceImpl()) },
                new Object[] { "externalId", SyncInfo.builder().externalId("externalId") },
                new Object[] { "syncedAt", SyncInfo.builder().syncedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void channel() {
        SyncInfo value = SyncInfo.of();
        value.setChannel(new com.commercetools.history.models.common.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.history.models.common.ChannelReferenceImpl());
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
        value.setSyncedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getSyncedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
