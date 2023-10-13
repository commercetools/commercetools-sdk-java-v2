
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
public class ProductVariantPatchRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantPatchRequestBuilder builder) {
        ProductVariantPatchRequest productVariantPatchRequest = builder.buildUnchecked();
        Assertions.assertThat(productVariantPatchRequest).isInstanceOf(ProductVariantPatchRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantPatchRequest.builder()
                .patches(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl())) } };
    }

    @Test
    public void patches() {
        ProductVariantPatchRequest value = ProductVariantPatchRequest.of();
        value.setPatches(Collections
                .singletonList(new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl()));
        Assertions.assertThat(value.getPatches())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl()));
    }
}
