
package com.commercetools.importapi.models.importcontainers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeToLiveRetentionPolicyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeToLiveRetentionPolicyBuilder builder) {
        TimeToLiveRetentionPolicy timeToLiveRetentionPolicy = builder.buildUnchecked();
        Assertions.assertThat(timeToLiveRetentionPolicy).isInstanceOf(TimeToLiveRetentionPolicy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "config", TimeToLiveRetentionPolicy.builder()
                .config(new com.commercetools.importapi.models.importcontainers.TimeToLiveConfigImpl()) } };
    }

    @Test
    public void config() {
        TimeToLiveRetentionPolicy value = TimeToLiveRetentionPolicy.of();
        value.setConfig(new com.commercetools.importapi.models.importcontainers.TimeToLiveConfigImpl());
        Assertions.assertThat(value.getConfig())
                .isEqualTo(new com.commercetools.importapi.models.importcontainers.TimeToLiveConfigImpl());
    }
}
