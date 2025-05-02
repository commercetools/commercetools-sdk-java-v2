
package com.commercetools.api.models.channel;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelUpdateBuilder builder) {
        ChannelUpdate channelUpdate = builder.buildUnchecked();
        Assertions.assertThat(channelUpdate).isInstanceOf(ChannelUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ChannelUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ChannelUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelUpdateActionImpl())) } };
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
