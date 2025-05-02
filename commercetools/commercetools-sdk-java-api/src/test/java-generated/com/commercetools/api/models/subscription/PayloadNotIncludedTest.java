
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PayloadNotIncludedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PayloadNotIncludedBuilder builder) {
        PayloadNotIncluded payloadNotIncluded = builder.buildUnchecked();
        Assertions.assertThat(payloadNotIncluded).isInstanceOf(PayloadNotIncluded.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reason", PayloadNotIncluded.builder().reason("reason") },
                new Object[] { "payloadType", PayloadNotIncluded.builder().payloadType("payloadType") } };
    }

    @Test
    public void reason() {
        PayloadNotIncluded value = PayloadNotIncluded.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }

    @Test
    public void payloadType() {
        PayloadNotIncluded value = PayloadNotIncluded.of();
        value.setPayloadType("payloadType");
        Assertions.assertThat(value.getPayloadType()).isEqualTo("payloadType");
    }
}
