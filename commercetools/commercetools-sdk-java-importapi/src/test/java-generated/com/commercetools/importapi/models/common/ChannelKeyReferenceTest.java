
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelKeyReferenceBuilder builder) {
        ChannelKeyReference channelKeyReference = builder.buildUnchecked();
        Assertions.assertThat(channelKeyReference).isInstanceOf(ChannelKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ChannelKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ChannelKeyReference value = ChannelKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
