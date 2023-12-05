
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
public class AzureEventGridDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AzureEventGridDestinationBuilder builder) {
        AzureEventGridDestination azureEventGridDestination = builder.buildUnchecked();
        Assertions.assertThat(azureEventGridDestination).isInstanceOf(AzureEventGridDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AzureEventGridDestination.builder().uri("uri") },
                new Object[] { AzureEventGridDestination.builder().accessKey("accessKey") } };
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
