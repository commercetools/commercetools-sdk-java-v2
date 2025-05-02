
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UpdateSyncInfoChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UpdateSyncInfoChangeBuilder builder) {
        UpdateSyncInfoChange updateSyncInfoChange = builder.buildUnchecked();
        Assertions.assertThat(updateSyncInfoChange).isInstanceOf(UpdateSyncInfoChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", UpdateSyncInfoChange.builder().change("change") },
                new Object[] { "nextValue",
                        UpdateSyncInfoChange.builder()
                                .nextValue(new com.commercetools.history.models.common.SyncInfoImpl()) },
                new Object[] { "channelId", UpdateSyncInfoChange.builder().channelId("channelId") } };
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
