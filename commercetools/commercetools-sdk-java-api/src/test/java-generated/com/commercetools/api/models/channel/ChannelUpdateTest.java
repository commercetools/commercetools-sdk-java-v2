
package com.commercetools.api.models.channel;

import java.util.Collections;

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
public class ChannelUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelUpdateBuilder builder) {
        ChannelUpdate channelUpdate = builder.buildUnchecked();
        Assertions.assertThat(channelUpdate).isInstanceOf(ChannelUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelUpdate.builder().version(2L) },
                new Object[] { ChannelUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ChannelUpdate value = ChannelUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ChannelUpdate value = ChannelUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.channel.ChannelUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.channel.ChannelUpdateActionImpl()));
    }
}
