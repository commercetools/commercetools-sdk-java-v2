
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AzureEventGridDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AzureEventGridDestinationBuilder builder) {
        AzureEventGridDestination azureEventGridDestination = builder.buildUnchecked();
        Assertions.assertThat(azureEventGridDestination).isInstanceOf(AzureEventGridDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "uri", AzureEventGridDestination.builder().uri("uri") },
                new Object[] { "accessKey", AzureEventGridDestination.builder().accessKey("accessKey") } };
    }

    @Test
    public void uri() {
        AzureEventGridDestination value = AzureEventGridDestination.of();
        value.setUri("uri");
        Assertions.assertThat(value.getUri()).isEqualTo("uri");
    }

    @Test
    public void accessKey() {
        AzureEventGridDestination value = AzureEventGridDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }
}
