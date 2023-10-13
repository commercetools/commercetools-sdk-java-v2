
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

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
public class PriceImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceImportRequestBuilder builder) {
        PriceImportRequest priceImportRequest = builder.buildUnchecked();
        Assertions.assertThat(priceImportRequest).isInstanceOf(PriceImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl())) } };
    }

    @Test
    public void resources() {
        PriceImportRequest value = PriceImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl()));
    }
}
