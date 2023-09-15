
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

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
public class OrderUpdateSyncInfoActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderUpdateSyncInfoActionBuilder builder) {
        OrderUpdateSyncInfoAction orderUpdateSyncInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderUpdateSyncInfoAction).isInstanceOf(OrderUpdateSyncInfoAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderUpdateSyncInfoAction.builder().externalId("externalId") },
                new Object[] { OrderUpdateSyncInfoAction.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] {
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
