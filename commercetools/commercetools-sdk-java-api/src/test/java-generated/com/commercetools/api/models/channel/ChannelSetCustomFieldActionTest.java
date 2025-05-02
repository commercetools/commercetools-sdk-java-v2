
package com.commercetools.api.models.channel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelSetCustomFieldActionBuilder builder) {
        ChannelSetCustomFieldAction channelSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetCustomFieldAction).isInstanceOf(ChannelSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ChannelSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ChannelSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ChannelSetCustomFieldAction value = ChannelSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ChannelSetCustomFieldAction value = ChannelSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
