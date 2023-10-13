
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
public class ProductVariantImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantImportRequestBuilder builder) {
        ProductVariantImportRequest productVariantImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productVariantImportRequest).isInstanceOf(ProductVariantImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantImportRequest.builder()
                .resources(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductVariantImportRequest value = ProductVariantImportRequest.of();
        value.setResources(Collections
                .singletonList(new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl()));
    }
}
