
package com.commercetools.api.models.channel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelSetAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelSetAddressCustomFieldActionBuilder builder) {
        ChannelSetAddressCustomFieldAction channelSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetAddressCustomFieldAction)
                .isInstanceOf(ChannelSetAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ChannelSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", ChannelSetAddressCustomFieldAction.builder().value("value") } };
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
