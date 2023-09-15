
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
public class HttpDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(HttpDestinationBuilder builder) {
        HttpDestination httpDestination = builder.buildUnchecked();
        Assertions.assertThat(httpDestination).isInstanceOf(HttpDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { HttpDestination.builder().url("url") },
                new Object[] { HttpDestination.builder()
                        .authentication(
                            new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl()) } };
    }

    @Test
    public void url() {
        HttpDestination value = HttpDestination.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void authentication() {
        HttpDestination value = HttpDestination.of();
        value.setAuthentication(new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl());
        Assertions.assertThat(value.getAuthentication())
                .isEqualTo(new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl());
    }
}
