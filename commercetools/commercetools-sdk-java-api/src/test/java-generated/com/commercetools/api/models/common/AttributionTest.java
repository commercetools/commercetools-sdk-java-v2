
package com.commercetools.api.models.common;

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
public class AttributionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributionBuilder builder) {
        Attribution attribution = builder.buildUnchecked();
        Assertions.assertThat(attribution).isInstanceOf(Attribution.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Attribution.builder().clientId("clientId") },
                new Object[] { Attribution.builder()
                        .source(com.commercetools.api.models.common.AttributionSource.findEnum("Import")) } };
    }

    @Test
    public void clientId() {
        Attribution value = Attribution.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void source() {
        Attribution value = Attribution.of();
        value.setSource(com.commercetools.api.models.common.AttributionSource.findEnum("Import"));
        Assertions.assertThat(value.getSource())
                .isEqualTo(com.commercetools.api.models.common.AttributionSource.findEnum("Import"));
    }
}
