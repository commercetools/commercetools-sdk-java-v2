
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CloudEventsFormatTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CloudEventsFormatBuilder builder) {
        CloudEventsFormat cloudEventsFormat = builder.buildUnchecked();
        Assertions.assertThat(cloudEventsFormat).isInstanceOf(CloudEventsFormat.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cloudEventsVersion",
                CloudEventsFormat.builder().cloudEventsVersion("cloudEventsVersion") } };
    }

    @Test
    public void cloudEventsVersion() {
        CloudEventsFormat value = CloudEventsFormat.of();
        value.setCloudEventsVersion("cloudEventsVersion");
        Assertions.assertThat(value.getCloudEventsVersion()).isEqualTo("cloudEventsVersion");
    }
}
