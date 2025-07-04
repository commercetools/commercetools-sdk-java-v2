
package com.commercetools.importapi.models.importcontainers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeToLiveConfigTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeToLiveConfigBuilder builder) {
        TimeToLiveConfig timeToLiveConfig = builder.buildUnchecked();
        Assertions.assertThat(timeToLiveConfig).isInstanceOf(TimeToLiveConfig.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "timeToLive", TimeToLiveConfig.builder().timeToLive("timeToLive") } };
    }

    @Test
    public void timeToLive() {
        TimeToLiveConfig value = TimeToLiveConfig.of();
        value.setTimeToLive("timeToLive");
        Assertions.assertThat(value.getTimeToLive()).isEqualTo("timeToLive");
    }
}
