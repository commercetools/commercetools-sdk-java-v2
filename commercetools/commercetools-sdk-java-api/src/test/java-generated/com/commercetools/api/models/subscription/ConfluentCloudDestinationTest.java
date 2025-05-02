
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConfluentCloudDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConfluentCloudDestinationBuilder builder) {
        ConfluentCloudDestination confluentCloudDestination = builder.buildUnchecked();
        Assertions.assertThat(confluentCloudDestination).isInstanceOf(ConfluentCloudDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "bootstrapServer",
                        ConfluentCloudDestination.builder().bootstrapServer("bootstrapServer") },
                new Object[] { "apiKey", ConfluentCloudDestination.builder().apiKey("apiKey") },
                new Object[] { "apiSecret", ConfluentCloudDestination.builder().apiSecret("apiSecret") },
                new Object[] { "acks", ConfluentCloudDestination.builder().acks("acks") },
                new Object[] { "topic", ConfluentCloudDestination.builder().topic("topic") },
                new Object[] { "key", ConfluentCloudDestination.builder().key("key") } };
    }

    @Test
    public void bootstrapServer() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setBootstrapServer("bootstrapServer");
        Assertions.assertThat(value.getBootstrapServer()).isEqualTo("bootstrapServer");
    }

    @Test
    public void apiKey() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setApiKey("apiKey");
        Assertions.assertThat(value.getApiKey()).isEqualTo("apiKey");
    }

    @Test
    public void apiSecret() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setApiSecret("apiSecret");
        Assertions.assertThat(value.getApiSecret()).isEqualTo("apiSecret");
    }

    @Test
    public void acks() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setAcks("acks");
        Assertions.assertThat(value.getAcks()).isEqualTo("acks");
    }

    @Test
    public void topic() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setTopic("topic");
        Assertions.assertThat(value.getTopic()).isEqualTo("topic");
    }

    @Test
    public void key() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
