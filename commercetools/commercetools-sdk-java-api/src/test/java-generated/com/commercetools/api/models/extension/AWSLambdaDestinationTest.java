
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AWSLambdaDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AWSLambdaDestinationBuilder builder) {
        AWSLambdaDestination aWSLambdaDestination = builder.buildUnchecked();
        Assertions.assertThat(aWSLambdaDestination).isInstanceOf(AWSLambdaDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "arn", AWSLambdaDestination.builder().arn("arn") },
                new Object[] { "accessKey", AWSLambdaDestination.builder().accessKey("accessKey") },
                new Object[] { "accessSecret", AWSLambdaDestination.builder().accessSecret("accessSecret") } };
    }

    @Test
    public void arn() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setArn("arn");
        Assertions.assertThat(value.getArn()).isEqualTo("arn");
    }

    @Test
    public void accessKey() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }
}
