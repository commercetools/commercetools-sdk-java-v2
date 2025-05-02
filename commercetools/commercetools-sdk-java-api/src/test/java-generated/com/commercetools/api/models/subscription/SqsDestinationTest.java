
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SqsDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SqsDestinationBuilder builder) {
        SqsDestination sqsDestination = builder.buildUnchecked();
        Assertions.assertThat(sqsDestination).isInstanceOf(SqsDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "accessKey", SqsDestination.builder().accessKey("accessKey") },
                new Object[] { "accessSecret", SqsDestination.builder().accessSecret("accessSecret") },
                new Object[] { "queueUrl", SqsDestination.builder().queueUrl("queueUrl") },
                new Object[] { "region", SqsDestination.builder().region("region") },
                new Object[] { "authenticationMode",
                        SqsDestination.builder()
                                .authenticationMode(com.commercetools.api.models.subscription.AwsAuthenticationMode
                                        .findEnum("Credentials")) } };
    }

    @Test
    public void accessKey() {
        SqsDestination value = SqsDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        SqsDestination value = SqsDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }

    @Test
    public void queueUrl() {
        SqsDestination value = SqsDestination.of();
        value.setQueueUrl("queueUrl");
        Assertions.assertThat(value.getQueueUrl()).isEqualTo("queueUrl");
    }

    @Test
    public void region() {
        SqsDestination value = SqsDestination.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void authenticationMode() {
        SqsDestination value = SqsDestination.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
    }
}
