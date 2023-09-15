
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
public class ChannelReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelReferenceBuilder builder) {
        ChannelReference channelReference = builder.buildUnchecked();
        Assertions.assertThat(channelReference).isInstanceOf(ChannelReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChannelReference.builder().obj(new com.commercetools.api.models.channel.ChannelImpl()) },
                new Object[] { ChannelReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ChannelReference value = ChannelReference.of();
        value.setObj(new com.commercetools.api.models.channel.ChannelImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.channel.ChannelImpl());
    }

    @Test
    public void id() {
        ChannelReference value = ChannelReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
