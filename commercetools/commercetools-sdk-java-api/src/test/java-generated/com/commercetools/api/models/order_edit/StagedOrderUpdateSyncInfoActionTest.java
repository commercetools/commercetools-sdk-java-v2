
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderUpdateSyncInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderUpdateSyncInfoActionBuilder builder) {
        StagedOrderUpdateSyncInfoAction stagedOrderUpdateSyncInfoAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderUpdateSyncInfoAction).isInstanceOf(StagedOrderUpdateSyncInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", StagedOrderUpdateSyncInfoAction.builder().externalId("externalId") },
                new Object[] { "channel",
                        StagedOrderUpdateSyncInfoAction.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "syncedAt", StagedOrderUpdateSyncInfoAction.builder()
                        .syncedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void externalId() {
        StagedOrderUpdateSyncInfoAction value = StagedOrderUpdateSyncInfoAction.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void channel() {
        StagedOrderUpdateSyncInfoAction value = StagedOrderUpdateSyncInfoAction.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void syncedAt() {
        StagedOrderUpdateSyncInfoAction value = StagedOrderUpdateSyncInfoAction.of();
        value.setSyncedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getSyncedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
