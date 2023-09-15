
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
public class ChannelSetAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelSetAddressCustomFieldActionBuilder builder) {
        ChannelSetAddressCustomFieldAction channelSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetAddressCustomFieldAction)
                .isInstanceOf(ChannelSetAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { ChannelSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ChannelSetAddressCustomFieldAction value = ChannelSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ChannelSetAddressCustomFieldAction value = ChannelSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
