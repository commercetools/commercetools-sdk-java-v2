
package com.commercetools.api.models.channel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelChangeKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelChangeKeyActionBuilder builder) {
        ChannelChangeKeyAction channelChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(channelChangeKeyAction).isInstanceOf(ChannelChangeKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ChannelChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ChannelChangeKeyAction value = ChannelChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
