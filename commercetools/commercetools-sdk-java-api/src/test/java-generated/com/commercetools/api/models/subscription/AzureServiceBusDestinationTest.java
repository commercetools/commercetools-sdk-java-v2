
package com.commercetools.api.models.subscription;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class AzureServiceBusDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AzureServiceBusDestinationBuilder builder) {
        AzureServiceBusDestination azureServiceBusDestination = builder.buildUnchecked();
        Assertions.assertThat(azureServiceBusDestination).isInstanceOf(AzureServiceBusDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AzureServiceBusDestination.builder().connectionString("connectionString") } };
    }

    @Test
    public void connectionString() {
        AzureServiceBusDestination value = AzureServiceBusDestination.of();
        value.setConnectionString("connectionString");
        Assertions.assertThat(value.getConnectionString()).isEqualTo("connectionString");
    }
}
