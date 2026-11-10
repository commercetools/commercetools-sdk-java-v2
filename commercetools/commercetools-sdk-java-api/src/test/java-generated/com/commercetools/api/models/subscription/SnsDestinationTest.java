
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SnsDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SnsDestinationBuilder builder) {
        SnsDestination snsDestination = builder.buildUnchecked();
        Assertions.assertThat(snsDestination).isInstanceOf(SnsDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "accessKey", SnsDestination.builder().accessKey("accessKey") },
                new Object[] { "accessSecret", SnsDestination.builder().accessSecret("accessSecret") },
                new Object[] { "topicArn", SnsDestination.builder().topicArn("topicArn") },
                new Object[] { "authenticationMode",
                        SnsDestination.builder()
                                .authenticationMode(com.commercetools.api.models.subscription.AwsAuthenticationMode
                                        .findEnum("Credentials")) } };
    }

    @Test
    public void accessKey() {
        SnsDestination value = SnsDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        SnsDestination value = SnsDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }

    @Test
    public void topicArn() {
        SnsDestination value = SnsDestination.of();
        value.setTopicArn("topicArn");
        Assertions.assertThat(value.getTopicArn()).isEqualTo("topicArn");
    }

    @Test
    public void authenticationMode() {
        SnsDestination value = SnsDestination.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
    }
}
