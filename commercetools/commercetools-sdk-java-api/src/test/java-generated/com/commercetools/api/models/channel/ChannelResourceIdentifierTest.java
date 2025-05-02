
package com.commercetools.api.models.channel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelResourceIdentifierBuilder builder) {
        ChannelResourceIdentifier channelResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(channelResourceIdentifier).isInstanceOf(ChannelResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ChannelResourceIdentifier.builder().id("id") },
                new Object[] { "key", ChannelResourceIdentifier.builder().key("key") } };
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
