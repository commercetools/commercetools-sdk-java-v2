
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelReferenceBuilder builder) {
        ChannelReference channelReference = builder.buildUnchecked();
        Assertions.assertThat(channelReference).isInstanceOf(ChannelReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ChannelReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ChannelReference value = ChannelReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
