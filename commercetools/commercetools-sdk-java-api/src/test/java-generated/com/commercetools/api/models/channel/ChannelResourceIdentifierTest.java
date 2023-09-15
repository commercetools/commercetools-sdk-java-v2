
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
public class ChannelResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelResourceIdentifierBuilder builder) {
        ChannelResourceIdentifier channelResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(channelResourceIdentifier).isInstanceOf(ChannelResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelResourceIdentifier.builder().id("id") },
                new Object[] { ChannelResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ChannelResourceIdentifier value = ChannelResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ChannelResourceIdentifier value = ChannelResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
