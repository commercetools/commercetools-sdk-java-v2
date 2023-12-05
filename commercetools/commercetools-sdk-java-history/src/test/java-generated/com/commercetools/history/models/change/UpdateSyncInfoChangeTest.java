
package com.commercetools.history.models.change;

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
public class UpdateSyncInfoChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(UpdateSyncInfoChangeBuilder builder) {
        UpdateSyncInfoChange updateSyncInfoChange = builder.buildUnchecked();
        Assertions.assertThat(updateSyncInfoChange).isInstanceOf(UpdateSyncInfoChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { UpdateSyncInfoChange.builder().change("change") },
                new Object[] { UpdateSyncInfoChange.builder()
                        .nextValue(new com.commercetools.history.models.common.SyncInfoImpl()) },
                new Object[] { UpdateSyncInfoChange.builder().channelId("channelId") } };
    }

    @Test
    public void change() {
        UpdateSyncInfoChange value = UpdateSyncInfoChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        UpdateSyncInfoChange value = UpdateSyncInfoChange.of();
        value.setNextValue(new com.commercetools.history.models.common.SyncInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.SyncInfoImpl());
    }

    @Test
    public void channelId() {
        UpdateSyncInfoChange value = UpdateSyncInfoChange.of();
        value.setChannelId("channelId");
        Assertions.assertThat(value.getChannelId()).isEqualTo("channelId");
    }
}
