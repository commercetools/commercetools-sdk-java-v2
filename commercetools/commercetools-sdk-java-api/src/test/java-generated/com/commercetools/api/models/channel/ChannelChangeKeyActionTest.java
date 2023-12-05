
package com.commercetools.api.models.channel;

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
public class ChannelChangeKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelChangeKeyActionBuilder builder) {
        ChannelChangeKeyAction channelChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(channelChangeKeyAction).isInstanceOf(ChannelChangeKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ChannelChangeKeyAction value = ChannelChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
