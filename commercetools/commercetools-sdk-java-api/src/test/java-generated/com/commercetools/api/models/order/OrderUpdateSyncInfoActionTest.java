
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderUpdateSyncInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderUpdateSyncInfoActionBuilder builder) {
        OrderUpdateSyncInfoAction orderUpdateSyncInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderUpdateSyncInfoAction).isInstanceOf(OrderUpdateSyncInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", OrderUpdateSyncInfoAction.builder().externalId("externalId") },
                new Object[] { "channel",
                        OrderUpdateSyncInfoAction.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "syncedAt",
                        OrderUpdateSyncInfoAction.builder().syncedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void externalId() {
        OrderUpdateSyncInfoAction value = OrderUpdateSyncInfoAction.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void channel() {
        OrderUpdateSyncInfoAction value = OrderUpdateSyncInfoAction.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void syncedAt() {
        OrderUpdateSyncInfoAction value = OrderUpdateSyncInfoAction.of();
        value.setSyncedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getSyncedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
