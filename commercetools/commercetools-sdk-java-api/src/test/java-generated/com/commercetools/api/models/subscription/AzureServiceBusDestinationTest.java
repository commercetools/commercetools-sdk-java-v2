
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AzureServiceBusDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AzureServiceBusDestinationBuilder builder) {
        AzureServiceBusDestination azureServiceBusDestination = builder.buildUnchecked();
        Assertions.assertThat(azureServiceBusDestination).isInstanceOf(AzureServiceBusDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "connectionString",
                AzureServiceBusDestination.builder().connectionString("connectionString") } };
    }

    @Test
    public void connectionString() {
        AzureServiceBusDestination value = AzureServiceBusDestination.of();
        value.setConnectionString("connectionString");
        Assertions.assertThat(value.getConnectionString()).isEqualTo("connectionString");
    }
}
