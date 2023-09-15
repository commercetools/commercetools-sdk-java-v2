
package com.commercetools.api.models.order_edit;

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
public class StagedOrderUpdateSyncInfoActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderUpdateSyncInfoActionBuilder builder) {
        StagedOrderUpdateSyncInfoAction stagedOrderUpdateSyncInfoAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderUpdateSyncInfoAction).isInstanceOf(StagedOrderUpdateSyncInfoAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderUpdateSyncInfoAction.builder().externalId("externalId") },
                new Object[] { StagedOrderUpdateSyncInfoAction.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { StagedOrderUpdateSyncInfoAction.builder()
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
