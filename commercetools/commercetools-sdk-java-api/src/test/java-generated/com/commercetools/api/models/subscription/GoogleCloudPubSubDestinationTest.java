
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GoogleCloudPubSubDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GoogleCloudPubSubDestinationBuilder builder) {
        GoogleCloudPubSubDestination googleCloudPubSubDestination = builder.buildUnchecked();
        Assertions.assertThat(googleCloudPubSubDestination).isInstanceOf(GoogleCloudPubSubDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "projectId", GoogleCloudPubSubDestination.builder().projectId("projectId") },
                new Object[] { "topic", GoogleCloudPubSubDestination.builder().topic("topic") } };
    }

    @Test
    public void projectId() {
        GoogleCloudPubSubDestination value = GoogleCloudPubSubDestination.of();
        value.setProjectId("projectId");
        Assertions.assertThat(value.getProjectId()).isEqualTo("projectId");
    }

    @Test
    public void topic() {
        GoogleCloudPubSubDestination value = GoogleCloudPubSubDestination.of();
        value.setTopic("topic");
        Assertions.assertThat(value.getTopic()).isEqualTo("topic");
    }
}
