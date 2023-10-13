
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
public class ProductImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductImportRequestBuilder builder) {
        ProductImportRequest productImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productImportRequest).isInstanceOf(ProductImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductImportRequest value = ProductImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl()));
    }
}
