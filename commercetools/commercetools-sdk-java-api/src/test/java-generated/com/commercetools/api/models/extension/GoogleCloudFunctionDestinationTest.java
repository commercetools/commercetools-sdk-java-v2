
package com.commercetools.api.models.extension;

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
public class GoogleCloudFunctionDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GoogleCloudFunctionDestinationBuilder builder) {
        GoogleCloudFunctionDestination googleCloudFunctionDestination = builder.buildUnchecked();
        Assertions.assertThat(googleCloudFunctionDestination).isInstanceOf(GoogleCloudFunctionDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GoogleCloudFunctionDestination.builder().url("url") } };
    }

    @Test
    public void url() {
        GoogleCloudFunctionDestination value = GoogleCloudFunctionDestination.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }
}
